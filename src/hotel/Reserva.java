
package hotel;

import java.util.Scanner;


public class Reserva {
    Scanner leer = new Scanner(System.in);
    Factura factu=new Factura();
    Habitaciones habi = new Habitaciones();
    Clientes cliente1 = new Clientes();
    
    private String empleado, cliente;
    private int habitacion, numHuesp,
            numeroAcompañantes, opcionMenu, calcularCostHab, mirarDispoHab, fechaR;
    private double precio, totalAprox;
    
    String habSencilla[] = new String[51];
    String habDoble[] = new String[51];
    String habSuite[] = new String[51];
    
    public Reserva() {
        empleado = "";
        cliente = "";
        fechaR = 0;
        habitacion = 0;
        precio = 0.0;
        opcionMenu=0;
        calcularCostHab=0;
        numeroAcompañantes=0;
        mirarDispoHab=0;
        totalAprox=0;
        numHuesp=0;
        
        
    }
    
    public Reserva(int numHuesp,double totalAprox,int calcularCostHab, int mirarDispoHab,String empleado, String cliente,int fechaR, int habitacion,  double precio, int opcionMenu, int numeroAcompañantes) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.fechaR = fechaR;
        this.habitacion = habitacion;
        this.precio = precio;
        this.opcionMenu=opcionMenu;
        this.numeroAcompañantes=numeroAcompañantes;
        this.calcularCostHab=calcularCostHab;
        this.mirarDispoHab=mirarDispoHab;
        this.totalAprox=totalAprox;
        this.numHuesp=numHuesp;
        
    }

    public int getNumHuesp() {
        return numHuesp;
    }

    public void setNumH(int numHuesp) {
        this.numHuesp = numHuesp;
    }

    public double getTotalAprox() {
        return totalAprox;
    }

    public void setTotalAprox(double totalAprox) {
        this.totalAprox = totalAprox;
    }

    public int getMirarDispoHab() {
        return mirarDispoHab;
    }

    public void setMirarDispoHab(int mirarDispoHab) {
        this.mirarDispoHab = mirarDispoHab;
    }

    public int getCalcularCostHab() {
        return calcularCostHab;
    }

    public void setCalcularCostHab(int calcularCostHab) {
        this.calcularCostHab = calcularCostHab;
    }
    

    public int getOpcionMenu() {
        return opcionMenu;
    }

    public void setOpcionMenu(int opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    
    public String getEmpleado() {
        return empleado;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }
    
    public void setFechaR(int fechaR) {
        this.fechaR = fechaR;
    }
    
    public int getFechaR() {
        return fechaR;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getHabitacion() {
        return habitacion;
    }

     public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setNumeroAcompañantes(int numeroAcompañantes) {
        this.numeroAcompañantes = numeroAcompañantes;
    }
    
    public int getNumeroAcompañantes() {
        return numeroAcompañantes;
    }
    
    
    public void tiempoEstadia() {
        
        int aux=0;
        System.out.println("Digite el número de dias a quedarse");
        System.out.println("Recuerde que el número de días se cuenta desde la primera noche, hasta el día del Check-out");
        cliente1.setTiempoEstadia(leer.nextInt());
        factu.setTiempo(cliente1.getTiempoEstadia());
        aux=cliente1.getTiempoEstadia();
        if(getCalcularCostHab()<0){
            System.out.println("Digite un número valido, por favor");
            tiempoEstadia();
        }
        switch(getCalcularCostHab()){
            case 1: 
                long costoSencilla=10000;
                setTotalAprox(costoSencilla*cliente1.getTiempoEstadia()*getNumeroAcompañantes());
                System.out.println(getTotalAprox());
                factu.setTotalApx(getTotalAprox());
                
                break;
            case 2:
                long costoDoble=14000;
                setTotalAprox(costoDoble*cliente1.getTiempoEstadia()*getNumeroAcompañantes());
                System.out.println(getTotalAprox());
                factu.setTotalApx(getTotalAprox());
                
                break;
            case 3:
                final long costoSuite=20000;
                setTotalAprox(costoSuite*cliente1.getTiempoEstadia()*getNumeroAcompañantes());
                System.out.println(getTotalAprox());
                factu.setTotalApx(getTotalAprox());
                break;
            default:
                System.out.println("ERRROR");
                break;         
        }
        factu.setNum(getNumeroAcompañantes());
       
    }
    
    public void eleccionHabMuchos(){
        int cont=0;
        cont=getHabitacion()+getNumeroAcompañantes();
        int j=0;
        String cont2=" ";
        int i=0;
        i=getHabitacion();
        //if para saber si el cliente digito la habitación mal
        if(getMirarDispoHab()!=0){
            i=(getMirarDispoHab()+getHabitacion());
            j=getMirarDispoHab();
        }

        for (;i<cont;i++){
                
            if (1==getOpcionMenu()){  
                j++;
                System.out.println("Digite la habitación para el apartado número "+j+"° , por favor:");
                setHabitacion(leer.nextInt());
                if(getHabitacion()<0||getHabitacion()>50){
                    System.out.println("Digite un número valido, por favor");
                    eleccionHabMuchos();
                }
                switch (getCalcularCostHab()){
                    case 1:
                        
                        if("Reservada".equals(habSencilla[getHabitacion()])){
                            System.out.println("Digite otra habitación, por favor");
                            setMirarDispoHab(i);
                            eleccionHabMuchos();
                        }else{
                            habSencilla[getHabitacion()]="Reservada";
                            cont2=habSencilla[getHabitacion()];
                        }
                    break;
                    case 2:
                        if("Reservada".equals(habDoble[getHabitacion()])){
                            System.out.println("Digite otra habitación, por favor");
                            setMirarDispoHab(i);
                            eleccionHabMuchos();
                        }else{
                        habDoble[getHabitacion()]="Reservada";
                        cont2=habDoble[getHabitacion()];
                        }
                    break;
                    case 3:
                        if("Reservada".equals(habSuite[getHabitacion()])){
                            System.out.println("Digite otra habitación, por favor");
                            setMirarDispoHab(i);
                            eleccionHabMuchos();
                        }else{
                            habSuite[getHabitacion()]="Reservada";
                            cont2=habSuite[getHabitacion()];
                        break;
                        }
                    default:
                        System.out.println(getCalcularCostHab()+"es <---");
                        System.out.println("Acá hay un error");
                    break;
                    }
                //hacer if para que no pueda repetir la misma habitación
                System.out.println("La habitación número "+ getHabitacion()+"° está: "+cont2);
            }else{
                    //for para organizar las habitaciones desde el número que se digito
                    //osea si es 1, entonces 2 3 4 5 hasta la suma
                switch (getCalcularCostHab()){
                    case 1:
                        habSencilla[i]="Reservada";
                        cont2=habSencilla[i];
                    break;
                    case 2:
                    habDoble[i]="Reservada";
                    cont2=habDoble[i];
                     break;
                    case 3:
                        habSuite[i]="Reservada";
                        cont2=habSuite[i];
                    break;
                    default:
                        System.out.println(getCalcularCostHab()+"es <---");
                        System.out.println("Acá hay un error");
                    break;
                    }
                    System.out.println("La habitación numero "+i+"° está: "+cont2);
                }
            }   
        //OPERACIONES SIGUIENTES
        tiempoEstadia();
        
        cliente1.datosPersonas(getNumHuesp());
        
        factu.abono();
    }
    
    public void  eleccionHab (){
        
        int hab=0;
        String decision="", cont2=" ", deseo=" ";
        
        
        System.out.println("Recuerde que el hotel cuenta con 50 habitaciones de cada tipo");
        if(getNumeroAcompañantes()==1){
            System.out.println("Digite el número de la habitación donde se quiere hospedar, ");
            setHabitacion(leer.nextInt());
            if(getHabitacion()<=0||getHabitacion()>100){
                System.out.println("Digite un número valido");
                eleccionHab ();
            }
            
        }else{
            System.out.println("¿Desea que todos los huespedes "
                    + "se registren en habitaciones seguidas?");
            deseo=leer.next();
            if("si".equals(deseo)){
                System.out.println("Digite el número de habitación donde desea empezar a reservar, por favor");
                System.out.println("Señor cliente usted se hospedará en la primera habitación");
                setHabitacion(leer.nextInt());
            }else{
            System.out.println("Digite los numeros de las habitaciones donde se hospedarán");
            System.out.println("Señor cliente usted se hospedará en la primera habitación");
            setOpcionMenu(1);
            }
        }
        if(getNumeroAcompañantes()==1){
            hab=getHabitacion();
            switch (getCalcularCostHab()){
                case 1:
                    habSencilla[hab]="Reservada";
                    cont2=habSencilla[hab];
                    break;
                case 2:
                    habDoble[hab]="Reservada";
                    cont2=habDoble[hab];
                    break;
                case 3:
                    habSuite[hab]="Reservada";
                    cont2=habSuite[hab];
                    break;
                default:
                    System.out.println(getCalcularCostHab()+"es <---");
                    System.out.println("Acá hay un error");
                    break;
            }
            
            System.out.println("habitacion numero "+getHabitacion()+": "+cont2);
            //OPERACIONES SIGUIENTES
            tiempoEstadia();
            cliente1.datosPersonas(getNumHuesp());
            factu.abono();
        }else{
            eleccionHabMuchos();
                
            }
        }
    
    public void reservaSencilla (){
        setCalcularCostHab(1);
        for (int i=0;i<habSencilla.length;i++){
            habSencilla[i]="Disponible";
        }
        System.out.println("Numero de apartados: "+getNumeroAcompañantes());
        eleccionHab ();
        
        
    }
    
    public void reservaDoble (){
        setCalcularCostHab(2);
        int hab=0;
        float aux=0;
        String deseo="";
        
        for (int i=0;i<habDoble.length;i++){
            habDoble[i]="Disponible";
        }
        if(getNumeroAcompañantes()>1){
            
        
        System.out.println("Recuerde que al ser camas doble, 2 personas pueden hospedarse en la misma habitación");
        
        System.out.println("¿Desea que haya 2 huespedes por habitación doble?, si no, "
                + "entonces habrá 1 persona por habitación");
        deseo=leer.next();
        if ("si".equals(deseo)){
            aux=(getNumeroAcompañantes()/2);
            if(getNumeroAcompañantes()%2!=0){
                aux=(getNumeroAcompañantes()/2);
                aux-=(aux%1);
                aux++;
                
                
            }
            setNumeroAcompañantes((int) aux);
            System.out.println("La cantidad de apartados para doble son: "+(int) aux);
            }else if ("no".equals(deseo)){
                System.out.println("La cantidad de apartados para doble son: "+getNumeroAcompañantes());
            }else{
                System.out.println("Digite un valor valido");
                reservaDoble();
            }
        }else {
            System.out.println("La cantidad de apartados para doble son: "+getNumeroAcompañantes());
        }    
        
        eleccionHab ();
          
        
    }
    
    public void reservaSuite (){
        setCalcularCostHab(3);
        int hab=0;
        float aux=0;
        String deseo="";
        
        for (int i=0;i<habSuite.length;i++){
            habSuite[i]="Disponible";
        }
        if(getNumeroAcompañantes()>1){
        System.out.println("Recuerde que al ser camas doble, 2 personas pueden hospedarse en la misma habitación");
        System.out.println("¿Desea que haya 2 huespedes por habitación suite?, si no, "
                + "entonces habrá 1 persona por habitación");
        deseo=leer.next();
        if ("si".equals(deseo)){
            aux=(getNumeroAcompañantes()/2);
            if(getNumeroAcompañantes()%2!=0){
                aux=(getNumeroAcompañantes()/2);
                aux-=(aux%1);
                
                aux++;
                
                
            }
            setNumeroAcompañantes((int) aux);
            System.out.println("La cantidad de apartados para suite son: "+(int) aux);
            }else if ("no".equals(deseo)){
                System.out.println("La cantidad de apartados para suite son: "+getNumeroAcompañantes());
            }else{
                System.out.println("Digite un valor valido");
                reservaDoble();
            }
        }else {
          System.out.println("La cantidad de apartados para suite son: "+getNumeroAcompañantes());  
        }
        eleccionHab ();
        
    }
    
    public void terminado(){
        //metodo auxiliar, pensar en posible posición en el futuro.
        System.out.println("--------¡¡Muchas gracias por visitarnos!!--------"
                + "\n----------------¡¡Hasta pronto!!-----------------");
    }
    
    public void menu(){             
               
        System.out.println("--------¡Bienvenido a Pollitos Hotel!--------");
        System.out.println("--¿Qué desea hacer?--");
        System.out.println("**Digite un número para continuar, por favor**");
        
        System.out.println("1 - Información de las habitaciones.");
        System.out.println("2 - Hacer una reserva.");
        
        setOpcionMenu(leer.nextInt());
        if(getOpcionMenu()<0||getOpcionMenu()>2){
            System.out.println("##ERROR## Número no valido, digite otra vez, por favor");
            menu();
        }
        decisionPrincipal();
    }
    
    public void info(){
        String deseo;
        
        
        System.out.println("\n --------Información sobre las habitaciones--------\n");
                System.out.println(" - El hotel cuenta con un total de 50 habitaciones por cada tipo - ");
                System.out.println(" --- Las habitaciones son:\n");
                System.out.println(" ---Habitación tipo sencilla---");
                habi.sencilla();
                System.out.println(" ---Habitación tipo doble---");
                habi.doble();
                System.out.println(" ---Habitación tipo suite---");
                habi.suite();
                
                System.out.println("**¿Desea hacer una reservación?**");
                deseo= leer.next();
                if ("si".equals(deseo)){
                    setOpcionMenu(2);
                    decisionPrincipal();
                    
                } else if("no".equals(deseo)){
                    terminado();
                }
    }
    
    public void decisionPrincipal(){
        switch(getOpcionMenu()) {
            case 1:
                info();
                break; 
            case 2:
                reservita();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    //******NUEVO METODO ******
    public void Auxiliar1(){
        int deseo;
 
            System.out.println("¿Cual de las habitaciones quiere reservar?"); 
            System.out.println("1- Sencilla \n2- Doble \n3- Suite");
            deseo=leer.nextInt();

            switch(deseo){
                case 1:
                        System.out.println(" Se hospedará en sencilla");
                        
                        habi.setSencilla(1);
                        reservaSencilla();
                        factu.setTipoHab("Sencilla");
                    break;
                case 2:
                        System.out.println(" Se hospedará en doble");
                        
                        habi.setDoble(1);
                        reservaDoble();
                        factu.setTipoHab("Doble");
                    break;
                case 3:
                        System.out.println(" Se hospedará en suite");
                        habi.setSuite(1);
                        reservaSuite();
                        factu.setTipoHab("Suite");
                    break;
                default:
                    System.out.println("Digitó un número invalido");
                    Auxiliar1();
                    break;

            }
        
    }
    
    public void reservita(){
                
        String decision, modificacion, deseo2;
        int  decideya, confirmacion, deseo;
        
        System.out.println("**Querido cliente, ¿ya miró los tipos de habitaciones?, digite si o no por favor**");
        decision=leer.next();
        if ("no".equals(decision)){
            info();
        }else if ("si".equals(decision)){
                
    
            System.out.println("--------¡¡Bienvenido a la reserva en línea!!--------");

            //Inicio de petición de datos para la reserva.

            System.out.println("--Digite los siguientes datos, por favor--");
            System.out.println("**Nombre del titular**");
            cliente1.setNombreTitular(leer.next());
            factu.setNombre(cliente1.getNombreTitular());

            System.out.println("**Apellido por favor**");
            cliente1.setApellidoTitular(leer.next());
            factu.setApellido(cliente1.getApellidoTitular());

            System.out.println("**Cedula del señor(a) "+cliente1.getNombreTitular()+"**");
            cliente1.setCedulaTitular(leer.next());
            factu.setId(cliente1.getCedulaTitular());

            System.out.println("**Señor(a) "+cliente1.getNombreTitular()+" ¿cuántas personas se hospedarán?, incluyendose a usted**");
            setNumeroAcompañantes(leer.nextInt());
            cliente1.setTiempoEstadia(getNumeroAcompañantes());
            setNumH(getNumeroAcompañantes());
            factu.setHuesp(getNumHuesp());
            
            System.out.println("Señor titular, usted será identificado con el número 1");
            
            //*******************CODIGO NUEVO**********************
            if (getNumeroAcompañantes()==1){
                Auxiliar1();
            }else if(getNumeroAcompañantes()<1){
                System.out.println("Digitó mal el número");
            }
            if (getNumeroAcompañantes()>1){
                 
                System.out.println("Todos los huespedes se hospedarán en un mismo tipo de habitación");
                
                
                    System.out.println("¿Cual de las habitaciones quiere reservar para todos?"); 
                    System.out.println("1- Sencilla \n2- Doble \n3- Suite");
                    deseo=leer.nextInt();
                switch(deseo){
                case 1:
                    System.out.println(" Se hospedarán en sencilla");
                    habi.setSencilla(getNumeroAcompañantes());
                    reservaSencilla();
                    break;

                case 2:
                    System.out.println(" Se hospedarán en doble");
                    habi.setDoble(getNumeroAcompañantes());
                    reservaDoble();
                    break;

                case 3:
                    System.out.println(" Se hospedarán en suite");
                    habi.setSuite(getNumeroAcompañantes());
                    reservaSuite();
                    break;

                    default:
                    System.out.println("Digitó un número invalido");
                    break;
                }

                
            }
             //******TERMINA CODIGO NUEVO************
        }
    }
    //***metodo donde estarán las noches****
        
}

