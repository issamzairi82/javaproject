/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entreprise.gestion.personnel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Clock;

/**
 *
 * @author Issam
 */
public class Connexionbd {
    private Connection cnx;
    String urlpilote = "com.mysql.jdbc.Driver";
    String urlbd = "jdbc:mysql://localhost:3306/gestion_stagiaire";
    
    public Connexionbd(){
        try{
           Class.forName(urlpilote); 
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
            cnx = DriverManager.getConnection(urlbd,"root","");
        }catch(SQLException ex){
             System.out.println(ex);
        }
          
    }
    
    
    Connection connexion(){
        return cnx;
    }
    
}
