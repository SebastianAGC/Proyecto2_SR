
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */

public class Control {    
    
    ArrayList<CPU> CpuList = new ArrayList();
    ArrayList<Case> CaseList = new ArrayList();
    ArrayList<GPU> GpuList = new ArrayList();
    ArrayList<Motherboard> MoboList = new ArrayList();
    ArrayList<Ram> RamList = new ArrayList();
    ArrayList<discoDuro> discoDuroList = new ArrayList();
    ArrayList<powerSupply> PSUList = new ArrayList();
    
    
    
    public void crearNodosMotherboards(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\mobo.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> mobos = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                mobos.add(line);    
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
                for (String s: mobos){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String modelo = String.format("\"%s\"", temp[1]);
                    String tipo = String.format("\"%s\"", temp[2]);
                    String socket = String.format("\"%s\"", temp[3]);
                    double precio = Double.parseDouble(temp[4]);
                    String tipoRam = String.format("\"%s\"", temp[5]);
                    String puertoPCI = String.format("\"%s\"", temp[6]);
                    int consumo = Integer.parseInt(temp[7]);
                    String link = String.format("\"%s\"", temp[8]);
                    //Creacion del nodo con los parametros obtenidos
                    MoboList.add(new Motherboard(marca, modelo, tipo, socket, precio, tipoRam, puertoPCI, consumo, link));
                    stmt.executeQuery("CREATE (n: Motherboard {marca: "+marca+", modelo: "+modelo+", tipo: "+tipo+", socket: "+socket+", precio: "+precio+", tipoRam: "+tipoRam+", puertoPCI: "+puertoPCI+", consumo: "+consumo+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void crearNodosCPU(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\cpu.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> cpu = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                cpu.add(line);    
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
                for (String s: cpu){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String modelo = String.format("\"%s\"", temp[1]);
                    String generacion = String.format("\"%s\"", temp[2]);
                    String socket = String.format("\"%s\"", temp[3]);
                    String tipoRam = String.format("\"%s\"", temp[4]);
                    double frecuencia = Double.parseDouble(temp[5]);
                    int consumo = Integer.parseInt(temp[6]);
                    double precio = Double.parseDouble(temp[7]);
                    String link = String.format("\"%s\"", temp[8]);
                    //Creacion del nodo con los parametros obtenidos
                    CpuList.add(new CPU(marca, modelo, generacion, socket, tipoRam, frecuencia, consumo, precio, link));
                    stmt.executeQuery("CREATE (n: CPU {marca: "+marca+", modelo: "+modelo+", generacion: "+generacion+", socket: "+socket+", tipoRam: "+tipoRam+", frecuencia: "+frecuencia+", consumo: "+consumo+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }

    public void crearNodosCase(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\case.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> cases = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                cases.add(line);    
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
                for (String s: cases){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String tamaño = String.format("\"%s\"", temp[1]);
                    String tipoMobo= String.format("\"%s\"", temp[2]);
                    double precio = Double.parseDouble(temp[3]);
                    String link = String.format("\"%s\"", temp[4]);
                    //Creacion del nodo con los parametros obtenidos
                    CaseList.add(new Case(marca, tamaño, tipoMobo, precio, link));
                    stmt.executeQuery("CREATE (n: Case {marca: "+marca+", tamanio: "+tamaño+", tipoMobo: "+tipoMobo+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        } 
    }

    public void crearNodosGPU(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\gpu.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> gpu = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                gpu.add(line);    
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
                for (String s: gpu){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String modelo = String.format("\"%s\"", temp[1]);
                    String tipoPCI= String.format("\"%s\"", temp[2]);
                    int capacidad = Integer.parseInt(temp[3]);
                    int consumo = Integer.parseInt(temp[4]);
                    double precio = Double.parseDouble(temp[5]);
                    String link = String.format("\"%s\"", temp[6]);
                    //Creacion del nodo con los parametros obtenidos
                    GpuList.add(new GPU(marca, modelo, tipoPCI, capacidad, consumo, precio, link));
                    stmt.executeQuery("CREATE (n: GPU {marca: "+marca+", modelo: "+modelo+", tipoPCI: "+tipoPCI+", capacidad: "+capacidad+", consumo: "+consumo+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public void crearNodosRam(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\ram.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> ram = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                ram.add(line);    
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
                for (String s: ram){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String modelo = String.format("\"%s\"", temp[1]);
                    String tipo= String.format("\"%s\"", temp[2]);
                    int capacidad = Integer.parseInt(temp[3]);
                    int consumo = Integer.parseInt(temp[4]);
                    double precio = Double.parseDouble(temp[5]);
                    String link = String.format("\"%s\"", temp[6]);
                    //Creacion del nodo con los parametros obtenidos
                    RamList.add(new Ram(marca, modelo, tipo, capacidad, consumo, precio, link));
                    stmt.executeQuery("CREATE (n: Ram {marca: "+marca+", modelo: "+modelo+", tipo: "+tipo+", capacidad: "+capacidad+", consumo: "+consumo+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public void crearNodosDiscoDuro(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\discoDuro.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> discoDuro = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                discoDuro.add(line);    
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
                for (String s: discoDuro){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    int rpm = Integer.parseInt(temp[1]);
                    int capacidad = Integer.parseInt(temp[2]);
                    int consumo = Integer.parseInt(temp[3]);
                    double precio = Double.parseDouble(temp[4]);
                    String link = String.format("\"%s\"", temp[5]);
                    //Creacion del nodo con los parametros obtenidos
                    discoDuroList.add(new discoDuro(marca, rpm, capacidad, consumo, precio, link));
                    stmt.executeQuery("CREATE (n: discoDuro {marca: "+marca+", rpm: "+rpm+", capacidad: "+capacidad+", consumo: "+consumo+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    public void crearNodosPSU(){
        String csvFile = "C:\\Users\\User\\Documents\\UVG\\2016\\Segundo Ciclo\\Algoritmos y Estructuras de Datos\\Proyecto Recomendaciones\\psu.txt"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        ArrayList<String> psu = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                psu.add(line);    
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
                for (String s: psu){
                    String[] temp = s.split(", ");
                    String marca = String.format("\"%s\"", temp[0]);
                    String certificacion = String.format("\"%s\"", temp[1]);
                    String modularidad = String.format("\"%s\"", temp[2]);
                    int capacidad = Integer.parseInt(temp[3]);
                    double precio = Double.parseDouble(temp[4]);
                    String link = String.format("\"%s\"", temp[5]);
                    //Creacion del nodo con los parametros obtenidos
                    PSUList.add(new powerSupply(marca, certificacion, modularidad, capacidad, precio, link));
                    stmt.executeQuery("CREATE (n: PSU {marca: "+marca+", certificacion: "+certificacion+", modularidad: "+modularidad+", capacidad: "+capacidad+", precio:"+precio+", link:"+link+"})" );
                }
            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public void limpiarDB(){
        try {
            //la siguiente linea se debe modificar con el user y el password de neo4j
            Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=123,debug=true,noSsl,flatten=[-1,100,1000]"); 
                try (Statement stmt = con.createStatement()) {
                    stmt.executeQuery("match (n) detach \n delete n");
                }
                con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Case getMoboTypeOfCase(String tipo) {
        for(Case c : CaseList){
                if(tipo.equals(c.toString())){
                    return c;
                }
         }
        return null;
    }
    
    public Motherboard getCaseTypeOfMobo(String tipo) {
        for(Motherboard m : MoboList){
                if(tipo.equals(m.toString())){
                    return m;
                }
         }
        return null;
    }
}
