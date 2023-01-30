package org.example;

import java.util.*;




public class Operaciones {
   
    

    public static void main(String[] args) {
    
        System.out.println("Cliente 1");
        List<String> datosCliente = pedirDatosCliente();
        String nombre = datosCliente.get(0);
        String apellidos = datosCliente.get(1);
        String DNICi = datosCliente.get(2);
        Cliente cliente1 = new Cliente(nombre, apellidos, DNICi);
        
       /*  System.out.println("Cuenta bancaria 1");
        List<String> datos = pedirDatosCuenta();
        String DNI = datos.get(0);
        String saldo = datos.get(1);
        Cuenta cuenta1 = new Cuenta(DNI, saldo);

        System.out.println("Cuenta bancaria 2");
        List<String> datos2 = pedirDatosCuenta();
        String DNI2 = datos2.get(0);
        String saldo2 = datos2.get(1);
        Cuenta cuenta2 = new Cuenta(DNI2, saldo2);
        
        
        cuenta1.ingresarDinero(10000);
        cuenta2.retirarDinero(20);
        
        System.out.println("Datos de la Cuenta 1");
        List<String> datosCuenta;
        datosCuenta = cuenta1.getDatosCuenta();
        System.out.println("   ->      Titular: " + datosCuenta.get(0));
        System.out.println("   -> Nº de cuenta: " + datosCuenta.get(1));
        System.out.println("   ->        Saldo: " + datosCuenta.get(2));

        System.out.println("Datos de la Cuenta 2");
        List<String> datosCuenta2;
        datosCuenta2 = cuenta2.getDatosCuenta();
        System.out.println("   ->      Titular: " + datosCuenta2.get(0));
        System.out.println("   -> Nº de cuenta: " + datosCuenta2.get(1));
        System.out.println("   ->        Saldo: " + datosCuenta2.get(2));

*/
        
    
    }
        
        
        public static List<String> pedirDatosCuenta()
        {
            List<String> datosCuenta = new ArrayList<>();
            System.out.print ("Introduzca el DNI del titular: ");
            Scanner entradaEscaner = new Scanner (System.in); 
            String titular = entradaEscaner.nextLine (); 
            Double saldo = 0.0;
            System.out.print ("Introduzca el saldo inicial: ");
            while(!entradaEscaner.hasNextDouble())
            {
                System.out.print("No ha introducido un saldo correcto.\n" +
                        "Vuelva a intentarlo (sólo números y decimales): ");
                entradaEscaner.nextLine();
            }
            saldo = entradaEscaner.nextDouble();
            datosCuenta.add(titular);
            datosCuenta.add(Double.toString(saldo));
            return datosCuenta;
        }

        public static List<String> pedirDatosCliente()
        {
            List<String> datosCliente = new ArrayList<>();
            System.out.print ("Introduzca el nombre del cliente: ");
            Scanner entradaEscaner = new Scanner (System.in); 
            String nombre = entradaEscaner.nextLine (); 
            System.out.print ("Introduzca el apellido del cliente: ");
            String apellido = entradaEscaner.nextLine (); 
            System.out.print ("Introduzca el DNI del cliente: ");
            String DNI = entradaEscaner.nextLine (); 
            return datosCliente;
            
        }
   

}
