package org.example;
import java.util.*; 
import java.text.*;

public class Cuenta {

    private String DNITitular;
    private double saldo;
    private long numCuenta;
   
        public Cuenta(){

        }

        public Cuenta(String DNI, int saldo){
                super();
                this.DNITitular = DNI;
                this.saldo = saldo;
                Random numACuenta = new Random();
                this.numCuenta = Math.abs(numACuenta.nextLong());
        }

        public Cuenta(String DNI, String saldo){
            super();
            this.DNITitular = DNI;
            this.saldo = Double.valueOf(saldo);
            Random numACuenta = new Random();
            this.numCuenta = Math.abs(numACuenta.nextLong());
    }

        public void ingresarDinero(double ingreso){
            if (ingreso <= 0)
                System.out.println("El ingreso debe ser superior a 0 euros");
            else 
                saldo += ingreso;

        }

        public void retirarDinero(double reintegro){
            if (reintegro <= 0)
                System.out.println("El reintegro debe ser superior a 0 euros");
            else 
                saldo -= reintegro;

        }

        public double getSaldoCuenta(){
            return saldo;
        }


        public List<String> getDatosCuenta(){
        List<String> datosCuenta = new ArrayList<>();
        datosCuenta.add(DNITitular);
        datosCuenta.add(Long.toString(numCuenta));
        datosCuenta.add(Double.toString(saldo));
        
        return datosCuenta;
    }



        
    
}
