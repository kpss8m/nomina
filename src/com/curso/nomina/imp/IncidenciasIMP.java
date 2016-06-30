package com.curso.nomina.imp;

import com.curso.nomina.bean.Incidencias;
import com.curso.nomina.dao.IncidenciasDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Clase que ejecuta las operaciones de ABC de la entidad Incidencias.
 * @author Carlos A. García M.
 * @version 1.0
 */
public class IncidenciasIMP {
    
    private final IncidenciasDAO incidenciasDAO;

    /**
     * Constructor de la clase que se encarga de inicializar el DAO de incidencias.
     */
    public IncidenciasIMP() {
        incidenciasDAO = new IncidenciasDAO();
    }
    
    /**
     * Método que se encarga de invocar a la capa de datos para el registro de incidencias.
     * @param incidencias Datos de la incidencia a guardar
     * @throws SQLException Excepción que puede generarse durante el proceso de registro de la incidencia.
     */
    public void altaIncidencias(Incidencias incidencias) throws SQLException {
        if (!filtrosValidos(incidencias)) {
            throw new IllegalArgumentException("Los datos de la incidencia no están completos.");
        }
        
        incidenciasDAO.alta(incidencias);
    }
    
    /**
     * Método que se encarga de eliminar una incidencia en base al valor de su identificador.
     * @param idIncidencia Identificador de la incidencia.
     * @throws SQLException Excepción que puede generarse durante el proceso de baja de la incidencia.
     */
    public void bajaIncidencias(int idIncidencia) throws SQLException {
        if (idIncidencia == 0) {
            throw new IllegalArgumentException("No se especificó el identificador de la incidencia");
        }
        
        incidenciasDAO.baja(idIncidencia);
    }
    
    /**
     * Método que se encarga de actualizar los valores de una incidencia registrada.
     * @param incidencias Valores de la incidencia.
     * @throws SQLException Excepción que puede generarse durante el proceso de baja de la incidencia.
     */
    public void actualizarIncidencias(Incidencias incidencias) throws SQLException {
        if (!filtrosValidos(incidencias)) {
            throw new IllegalArgumentException("Los datos de la incidencia para actualizar no están completos.");
        }
        
        incidenciasDAO.actualizar(incidencias);
    }

    /**
     * Método que se encarga de consultar las incidencias de acuerdo a los parámetros de búsqueda.
     * @param fechaInicial Fecha inicial de consulta.
     * @param fechaFinal Fecha final de consulta.
     * @return Lista de incidencias obtenidas de la consulta.
     * @throws SQLException Excepción que puede generarse durante el proceso de consulta.
     */
    public List<Incidencias> obtenerIncidenciasPor(Date fechaInicial, Date fechaFinal) throws SQLException {
        if (fechaInicial == null || fechaFinal == null) {
            throw new IllegalArgumentException("Las fechas de consulta de incidencias no fueron especificadas");
        }
        if (fechaInicial.after(fechaFinal)) {
            throw new IllegalArgumentException("La fecha inicial no puede ser mayor a la fecha final");
        }
        
        return incidenciasDAO.consultarPor(fechaInicial, fechaFinal);
    }

    /**
     * Método privado que se encarga de validar que los atributos de la incidencia contengan valores.
     * @param incidencias Datos de la incidencia.
     * @return TRUE si la incidencia contiene valores en todos sus atributos, FALSE si no cumple.
     */
    private boolean filtrosValidos(Incidencias incidencias) {
        boolean validos = true;
        if (incidencias == null) {
            validos = false;
        } else {
            if (incidencias.getFecha() == null) {
                validos = false;
            }
            if (incidencias.getIdAsistencia() == 0) {
                validos = false;
            }
            if (incidencias.getObservaciones() == null ||
                    incidencias.getObservaciones().isEmpty()) {
                validos = false;
            }
            if (incidencias.getTipoIncidencia() == 0) {
                validos = false;
            }
        }
        
        return validos;
    }
}
