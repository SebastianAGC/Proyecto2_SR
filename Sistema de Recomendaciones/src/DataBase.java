
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastián
 */
public class DataBase {
    // Connect
    /*
Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost");

// Querying
try (Statement stmt = con.createStatement()) {
    ResultSet rs = stmt.executeQuery("MATCH (n:User) RETURN n.name");
    while (rs.next()) {
        System.out.println(rs.getString("n.name"));
    }
}
con.close();
*/
    public void createGraphComponentes(){
        String csvFile = "/Users/Diego/Documents/NetBeansProjects/neo4jprueba/datos.csv"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> componentes = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use punto coma as separator
                componentes.add(line);
               
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }        
     try {
            //la siguiente linea se debe modificar con el user y el password de neo4j
                    Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=123,debug=true,noSsl,flatten=[-1,100,1000]"); 
                    try (Statement stmt = con.createStatement()) {
                        stmt.executeQuery("match (n) detach \n delete n");
                        for (String s : componentes){
                            String[] temp = s.split(", ");
                            //agregar aqui el create con cypher
                        }
                    }
                    con.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }   
        
        
    }
 public void createGrafoPCArmadas(){
        String csvFile = "C:\\Users\\Diego\\Documents\\UVG\\Algoritmos y Estructuras de datos\\proyectoSR\\computadoras.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> computadoras = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                computadoras.add(line);    
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            //la siguiente linea se debe modificar con el user y el password de neo4j
                    Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=123,debug=true,noSsl,flatten=[-1,100,1000]"); 
                    try (Statement stmt = con.createStatement()) {
                        String gaming = String.format("\"%s\"", "gaming");
                        String diseno = String.format("\"%s\"", "diseno");
                        String regular = String.format("\"%s\"", "regular");
                        stmt.executeQuery("match (n) detach \n delete n");
                        stmt.executeQuery("CREATE (n:activity {name: "+gaming+"})");
                        stmt.executeQuery("CREATE (n:activity {name: "+diseno+"})");
                        stmt.executeQuery("CREATE (n:activity {name: "+regular+"})");
                        for (String s: computadoras){
                            String[] temp = s.split(", ");
                            String brand = String.format("\"%s\"", temp[0]);
                            String name = String.format("\"%s\"", temp[1]);
                            double weight = Double.parseDouble(temp[2]);
                            String use = String.format("\"%s\"", temp[3]);
                            int price = Integer.parseInt(temp[4]);
                            stmt.executeQuery("CREATE (n: Laptop {nombre: "+name+", marca: "+brand+",  peso: "+weight+", uso: "+use+", precio: "+price+"})" );
                            stmt.executeQuery("MATCH (n: Laptop {uso: "+use+"})"
                                    + "MATCH (m: activity {name: "+use+"})"
                                    + "merge (n)-[:GOOD_FOR]->(m)");
                    }
                    }
                    con.close();
                }catch (Exception ex){
                    System.out.println("no funciona"+line);
                    }
        
}
}

