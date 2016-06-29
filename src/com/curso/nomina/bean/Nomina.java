
package com.curso.nomina.bean;

public class Nomina {
	private int id_nomina;
	private int id_empleado;
	private int id_pago;
	private Date fecha;
	private int status;
	private float percepciones;
	private float deducciones;
	private float obligaciones;
	private float total;

    public int getId_nomina() {
        return id_nomina;
    }

    public void setId_nomina(int id_nomina) {
        this.id_nomina = id_nomina;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(float percepciones) {
        this.percepciones = percepciones;
    }

    public float getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(float deducciones) {
        this.deducciones = deducciones;
    }

    public float getObligaciones() {
        return obligaciones;
    }

    public void setObligaciones(float obligaciones) {
        this.obligaciones = obligaciones;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
        
        
    
}

