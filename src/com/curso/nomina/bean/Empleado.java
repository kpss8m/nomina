package com.curso.nomina.bean;

/**
*Implementacion de Empleado
*@autor Diego Falcon
*@autor limpb665@hotmail.com
*@version 1.0
*@see 
*/

public class Empleado
{
	private int id;
	private boolean status;
	private String nombre;
	private String paterno;
	private String materno;
	private Date f_nacimiento;
	private String rfc;
	private String curp;
	private String imss;
	private String departamento;
	private String puesto;
	private Date f_alta;
	private Date f_baja;
	private String causa_baja;
	private char sexo;
	private String foto;
	private int clasificacion;
	private int tipo_pago;
	private float salario_diario;
	
	public Empleado (int id, boolean status, String nombre, String paterno, String materno, Date f_nacimineto, String rfc, String curp, 
					 String imss, String departamento, String puesto, Date f_alta, char sexo, String foto, int clasificacion, 
					 int tipo_pago, float salario_diario);
	{
		this.id = id;
		this.status = status;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.f_nacimiento = f_nacimiento;
		this.rfc = rfc;
		this.curp = curp;
		this.imss = imss;
		this.departamento = departamento;
		this.puesto= puesto;
		this.f_alta = f_alta;
		this.f_baja = new Date ("0","0","0");
		this.causa_baja = "";
		this.sexo = sexo;
		this.foto = foto;
		this.clasificacion = clasificacion;
		this.tipo_pago = tipo_pago;
		this.salario_diario = salario_diario;
	}
}