
package com.curso.nomina.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.curso.nomina.bean;


public class NominaDAO extends DAO {
    
    public Nomina calculaNomina(Empleado emp) {
        Nomina nom = new Nomina;
        
        
        String sSql = "";
        
        
        
        this.Conectar();
        
         this.Conectar();
            ResultSet rs;
        
        
        

            PreparedStatement st = this.getCn().prepareStatement(sSql);

            rs = st.executeQuery();
            if (rs.next()) {
                    nom.setFolioSeguimiento(rs.getString("folioSeguimiento"));
            }
            
             this.Cerrar();
        
        
        return Nomina;
    }
}
