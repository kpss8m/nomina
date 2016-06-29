
package com.curso.nomina.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    private Connection cn;
    private String Driver;
    private String sConn;
    private String sUser;
    private String sPass;
    private Boolean bDebug;

    public Boolean getbDebug() {
        return bDebug;
    }

    public DAO() {
        Driver = "com.mysql.jdbc.Driver";
        sConn = "jdbc:mysql://localhost/test?user=minty&password=greatsqldb";
        bDebug = true;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void Conectar() throws Exception {
        try {
            Class.forName(Driver);
            cn = DriverManager.getConnection(sConn);

        } catch (Exception e) {
            if (bDebug) {
                System.err.println("Error al Conectar: " + e.getMessage());
            }
            throw e;
        }
    }

    public void Cerrar() throws Exception {
        try {

            if (cn != null) {
                if (!cn.isClosed()) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            if (bDebug) {
                System.err.println("Error al Desconectar: " + e.getMessage());
            }
            logger.error(e.getMessage());
            throw e;
        }
    }
}
