package com.curso.nomina.dao;

import com.curso.nomina.bean.Incidencias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase de acceso a la base de datos para la consulta y almacenamiento de las
 * incidencias de los empleados.
 * @author Carlos A. García M.
 * @version 1.0
 */
public class IncidenciasDAO extends DAO {
    
    public IncidenciasDAO() {
        super();
        if (super.getCn() == null) {
            try {
                super.Conectar();
            } catch (Exception ex) {
                //TODO Validar uso de logger
            }
        }
    }
    
    /**
     * Método que se encarga de registrar en la base de datos una incidencia.
     * @param incidencias Datos de la incidencia
     * @throws SQLException Excepción generada durante el proceso de inserción de la incidencia.
     */
    public void alta(Incidencias incidencias) throws SQLException {
        String qryInsert = "insert into incidencias (fecha, tipoincidencia, id_asistencia, observaciones) values (?,?,?,?)";

        PreparedStatement ps = super.getCn().prepareStatement(qryInsert);
        ps.setDate(1, new java.sql.Date(incidencias.getFecha().getTime()));
        ps.setInt(2, incidencias.getTipoIncidencia());
        ps.setInt(3, incidencias.getIdAsistencia());
        ps.setString(4, incidencias.getObservaciones());

        ps.executeUpdate();
    }
    
    /**
     * Método que se encarga de eliminar de la base de datos el registro de incidencias
     * en base al valor del identificador.
     * @param idIncidencia Identificador de la incidencia.
     * @throws SQLException Excepción generada durante el proceso de baja de la incidencia.
     */
    public void baja(int idIncidencia) throws SQLException {
        String qryDelete = "delete from incidencias where id_incidencia = ?";

        PreparedStatement ps = super.getCn().prepareStatement(qryDelete);
        ps.setInt(1, idIncidencia);

        ps.executeUpdate();
    }
    
    /**
     * Método que se encarga de actualizar los valores del registro de la incidencia.
     * @param incidencias Valores actualizados de la incidencia
     * @throws SQLException Excepción generada durante el proceso de actualización.
     */
    public void actualizar(Incidencias incidencias) throws SQLException {
        String qryUpdate = "update incidencias set fecha = ?, tipoincidencia = ?, id_asistencia = ?, observaciones = ? where id_incidencia = ?";

        PreparedStatement ps = super.getCn().prepareStatement(qryUpdate);
        ps.setDate(1, new java.sql.Date(incidencias.getFecha().getTime()));
        ps.setInt(2, incidencias.getTipoIncidencia());
        ps.setInt(3, incidencias.getIdAsistencia());
        ps.setString(4, incidencias.getObservaciones());
        ps.setInt(5, incidencias.getIdIncidencia());

        ps.executeUpdate();
    }
    
    /**
     * Método que consulta las diferentes incidencias registradas en un periodo de tiempo.
     * @param fechaInicial Fecha inicial de la consulta.
     * @param fechaFinal Fecha final de la consulta.
     * @return Lista de registros obtenidos en la consulta en base al rango de tiempo especificado.
     * @throws SQLException Excepción generada durante el proceso de consulta de las incidencias.
     */
    public List<Incidencias> consultarPor(Date fechaInicial, Date fechaFinal) throws SQLException {
        List<Incidencias> resultado = new ArrayList<>();
        
        String qrySearch = "select * from incidencias where fecha between ? and ?";
        
        PreparedStatement ps = super.getCn().prepareStatement(qrySearch);
        ps.setDate(1, new java.sql.Date(fechaInicial.getTime()));
        ps.setDate(2, new java.sql.Date(fechaFinal.getTime()));
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            resultado.add(new Incidencias(rs.getInt("id_incidencia"),
                    rs.getDate("feha"),
                    rs.getInt("tipoincidencia"),
                    rs.getInt("id_asistencia"),
                    rs.getString("observaciones")));
        }
        
        return resultado;
    }
}
