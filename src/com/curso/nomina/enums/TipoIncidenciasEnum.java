package com.curso.nomina.enums;

/**
 * Clase enum que define los tipos de incidencias que se pueden almacenar en la base de datos.
 * <ul>
 * <li>Inasistencia</li>
 * <li>Retardo</li>
 * <li>Incapacidad</li>
 * <li>Justificado</li>
 * </ul>
 * @author Carlos A. García M.
 * @version 1.0
 */
public enum TipoIncidenciasEnum {
    INASISTENCIA(1), RETARDO(2), INCAPACIDAD(3), JUSTIFICADO(4);
    
    private int id;

    private TipoIncidenciasEnum(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
