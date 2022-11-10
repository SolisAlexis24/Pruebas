package javaapplication2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GeneradorNombres {
    public String nom = "";
    public String ape = "";
    public void leer(){
        try{
            BufferedReader br;
            FileReader fr = new FileReader("C:\\Users\\Alexis\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\nombres.csv");
            br = new BufferedReader(fr);
            this.nom = br.readLine();
            System.out.println(nom);
            br.close();
        }catch(IOException ioe){
            System.out.println("Imposible leer");
        }
        try{
            BufferedReader br1;
            FileReader fr1 = new FileReader("C:\\Users\\Alexis\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\apellidos.csv");
            br1 = new BufferedReader(fr1);
            this.ape = br1.readLine();
            System.out.println(ape);
            br1.close();
        }catch(IOException ioe){
            System.out.println("Imposible leer");
        }
    }
    public void generar(){
        
    }
}
