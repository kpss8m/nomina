package com.curso.nomina.bean;

import java.util.Date;

/**
 * Clase que contiene los atributos de incidencias como:
 * <ul>
 *  <li>Fecha</li>
 *  <li>Tipo de Incidencia</li>
 *  <li>Asistencia</li>
 *  <li>Observaciones</li>
 * </ul>
 * @author Carlos A. García M.
 * @version 1.0
 */
public class Incidencias {
    
    private int idIncidencia;
    private Date fecha;
    private int tipoIncidencia;
    private int idAsistencia;
    private String observaciones;

    /**
     * Constructor de clase que recibe los valores para almacenarlos en los atributos locales.
     * @param idIncidencia Identificador de la incidencia.
     * @param fecha Fecha de la incidencia.
     * @param tipoIncidencia Tipo de Incidencia (Inasistencia, Retardo, Incapacidad, Justificado).
     * @param idAsistencia Identificador de la asistencia donde ocurre la incidencia.
     * @param observaciones Observaciones de la incidencia.
     */
    public Incidencias(int idIncidencia, Date fecha, int tipoIncidencia, int idAsistencia, String observaciones) {
        this.idIncidencia = idIncidencia;
        this.fecha = fecha;
        this.tipoIncidencia = tipoIncidencia;
        this.idAsistencia = idAsistencia;
        this.observaciones = observaciones;
    }

    /**
     * Devuelve el identificador de la incidencia.
     * @return Identificador de la incidencia.
     */
    public int getIdIncidencia() {
        return idIncidencia;
    }

    /**
     * Guarda el valor del identificador de la incidencia.
     * @param idIncidencia Id. Incidencia
     */
    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    /**
     * Devuelve el valor de la fecha de la incidencia.
     * @return Fecha de la incidencia.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Guarda la fecha de la incidencia.
     * @param fecha Fecha de la incidencia.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el tipo de incidencia.
     * @return Tipo de Incidencia.
     */
    public int getTipoIncidencia() {
        return tipoIncidencia;
    }

    /**
     * Guarda el tipo de incidencia.
     * @param tipoIncidencia Tipo de incidencia.
     */
    public void setTipoIncidencia(int tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    /**
     * Devuelve el identificador de la asistencia donde ocurre la incidencia.
     * @return Identificador de la asistencia.
     */
    public int getIdAsistencia() {
        return idAsistencia;
    }

    /**
     * Guarda el identificador de la asistencia.
     * @param idAsistencia Identificador de la incidencia.
     */
    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    /**
     * Devuelve las observaciones de la incidencia.
     * @return Observaciones de la incidencia.
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Guarda las observaciones de las incidencias
     * @param observaciones 
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
