package hotel;
import java.util.Scanner;
public class Clientes {
    
    private int tiempoEstadia, numeroH;
    int n;
   
    
    String nombreTitular, apellidoTitular, cedulaTitular;
    
    int[] habitacion = new int[51];
    
    String[] nombreAcompañantes = new String[51];
    
    String[] apellidoAcompañantes = new String[51];
    
    int[] cedulaAcompañantes = new int[51];
    
    int[] edadAcompañantes = new int[51]; 
    
    Scanner leer = new Scanner(System.in);
    
    public Clientes() {
        
        tiempoEstadia = 0;
        nombreTitular = "";
        numeroH=0;
    }
    
    public Clientes( int tiempoEstadia, String nombreTitular, int numeroH) {
       
        this.tiempoEstadia = tiempoEstadia;
        this.nombreTitular = nombreTitular;
        this.numeroH=numeroH;
    }

    public int getNumeroH() {
        return numeroH;
    }

    public void setNumeroH(int numeroH) {
        this.numeroH = numeroH;
    }


   public void setTiempoEstadia(int tiempoEstadia) {
        this.tiempoEstadia = tiempoEstadia;
    }

    public int getTiempoEstadia() {
        return tiempoEstadia;
    }
    
    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }
    
    public String getApellidoTitular() {
        return apellidoTitular;
    }
    
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    public String getNombreTitular() {
        return nombreTitular;
    }
    
    public void setCedulaTitular(String cedulaTitular) {
        this.cedulaTitular = cedulaTitular;
    }
    
    public String getCedulaTitular() {
        return cedulaTitular;
    }

    public void datosPersonas(int num){
        n = num;
        if(n==1){
            
        
        String deseo=" ";
        System.out.println("¿Desea registrar los nombre de todos los huespedes?, "
                + "no habría incoveniente si no lo hace");
        deseo=leer.nextLine();
        if("si".equals(deseo)){
            for(int i = 1; i <n; i++){
            
            System.out.println("Digite el nombre del huesped numero "+(i+1));
            nombreAcompañantes[i] = leer.next();
            System.out.println("Digite el apellido del huesped numero "+(i+1));
            apellidoAcompañantes[i] = leer.next();
            System.out.println("Digite el numero de identificacion del huesped numero "+(i+1));
            cedulaAcompañantes[i] = leer.nextInt();
            System.out.println("Digite la edad del huesped numero "+(i+1));
            edadAcompañantes[i] = leer.nextInt();
            System.out.println("Digite la habitación del huesped numero "+(i+1));
            habitacion[i]=leer.nextInt();
        }
         for(int i = 1; i <n; i++){
            System.out.println(" ");
            System.out.println("***Información del hueped--"+(i+1)+"***");
            System.out.println("Nombre del huesped------"+nombreAcompañantes[i]);
            System.out.println("identificación----------"+cedulaAcompañantes[i]);
            System.out.println("Habitación--------------"+habitacion[i]);
            System.out.println(" ");
         }
        }else if("no".equals(deseo)){
            
        }else{
            System.out.println("Digite un valor valido, por favor");
            datosPersonas(num);
        }
        }
        
        
    }



    
   
}