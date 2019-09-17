
package hotel;

import java.util.Scanner;

public class Empleados {
    Scanner lector = new Scanner(System.in);
    String nombre, apellido;
    
    int numero = 19855467;
 
    int cedulaEm[] = new int[20];
    
    String apellidos[] = new String[20];
    
    String nombres[] = new String[20];
    
    String cargos[] = new String[20];
    
    public Empleados() {
        nombre = "";
        apellido = "";
    }
    
    public Empleados(String nombre, String apellido) {
        
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    
    public String[] Apellidos() {
        
        apellidos[0] = "Valbuena";
        apellidos[1] = "Sanchez";
        apellidos[2] = "Ramirez";
        apellidos[3] = "Valderrama";
        apellidos[4] = "Gonzalez";
        apellidos[5] = "Perez";
        apellidos[6] = "Rodriguez";
        apellidos[7] = "Hoyos";
        apellidos[8] = "Ibanez";
        apellidos[9] = "Quintero";
        apellidos[10] = "Castaneda";
        apellidos[11] = "Charry";
        apellidos[12] = "Nieto";
        apellidos[13] = "Niño";
        apellidos[14] = "Pineda";
        apellidos[15] = "Sabogal";
        apellidos[16] = "Diaz";
        apellidos[17] = "Malagon";
        apellidos[18] = "Castro";
        apellidos[19] = "Martinez";
        
        return apellidos;
    }
    
    public String[] Nombres() {
        
        nombres[0] = "joseph";
        nombres[1] = "Daniel";
        nombres[2] = "Juan";
        nombres[3] = "Carlos";        
        nombres[4] = "Rodrigo";
        nombres[5] = "Ernesto";
        nombres[6] = "Jhoana";
        nombres[7] = "Andrea";
        nombres[8] = "Laura";
        nombres[9] = "Ana";
        nombres[10] = "Lorena";
        nombres[11] = "David";
        nombres[12] = "Jhoan";
        nombres[13] = "kevin";
        nombres[14] = "Jesus";
        nombres[15] = "Natali";
        nombres[16] = "Nathalia";
        nombres[17] = "Juana";
        nombres[18] = "Jeffry";
        nombres[19] = "Oscar";
        
        return nombres;
    }
    
    public int[] CedulaEmp() {
        
        for(int i = 0; i < cedulaEm.length; i++) {
            
            cedulaEm[i] = numero;
            
            numero ++;
           
        }
        
        return cedulaEm;
    }
    
    public String[] Cargos() {
        
        cargos[0] = "Cajero";
        cargos[1] = "Cajero";
        cargos[2] = "Botones";
        cargos[3] = "Bartender";
        cargos[4] = "Botones";
        cargos[5] = "Vigilante";
        cargos[6] = "Cajero";
        cargos[7] = "Vigilante";
        cargos[8] = "Aseador";
        cargos[9] = "Aseador";
        cargos[10] = "Aseador";
        cargos[11] = "Tècnico";
        cargos[12] = "Vigilante";
        cargos[13] = "Aseador";
        cargos[14] = "Jefe de Caja";
        cargos[15] = "Jefe de aseo";
        cargos[16] = "Jefe de vigilantes";
        cargos[17] = "Administrador";
        cargos[18] = "Recepcionista";
        cargos[19] = "Salvavidas";
     
        return cargos;
    }

}
