package org.example;
import java.time.LocalDateTime;
import java.util.*; 

public class Cliente {
        private String nombre, apellidos, DNI;
        private LocalDateTime fechaAlta;

        public Cliente(String nombre, String Apellidos, String DNI){
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.DNI = DNI;
                this.fechaAlta = LocalDateTime.now();
        }

        public String getNombre() {
                return nombre;
        }
        
       public void setNombre(String nombre){
                 this.nombre = nombre;               
        }

        public String getApellidos() {
                return apellidos;
        }
        
       public void setApellidos(String apellidos){
                 this.apellidos = apellidos;               
        }

        public String getDNI() {
                return DNI;
        }
        
       public void setDNI(String DNI){
                 this.DNI = DNI;               
        }

        public LocalDateTime getfechaAlta() {
                return fechaAlta;
        }

        public List<String> getDatosCliente(){
                List<String> datosCliente = new ArrayList<>();
                datosCliente.add(nombre);
                datosCliente.add(apellidos);
                datosCliente.add(DNI);
                datosCliente.add(fechaAlta.toString());
                return datosCliente;
        }
}