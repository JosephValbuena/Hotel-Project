
package hotel;

import java.util.Scanner;


public class Factura {
    int fecha, tiempo,huesp, salida, verif,aux,auxDeseo;
    double precio, totalPagar, totalApx, totalApxPago, pagarCheckout;
    int caja, num;
    int eleccion=0;
    String nombre, apellido, id, tipoHab, registro;
    Scanner lector = new Scanner(System.in);
    
    
    Empleados emple = new Empleados();
    Clientes cliente=new Clientes();
    
    public Factura() {
        fecha = 0;
        precio = 0;
        caja = 0;
        totalPagar = 0.0;
        totalApx=0;
        totalApxPago=0;
        registro=" ";
        salida=0;
        verif=0;
        aux=0;
    }
    
    public Factura(int aux,int verif,int salida,int num,String registro, String tipoHab, String nombre, 
                    String apellido, String id,int huesp,int tiempo,int fecha, 
                    double precio, int caja, double totalPagar, double totalApx,double totalApxPago) {
        this.fecha = fecha;
        this.precio = precio;
        this.caja = caja;
        this.totalApx=totalApx;
        this.totalPagar = totalPagar;
        this.totalApxPago=totalApxPago;
        this.tiempo=tiempo;
        this.huesp=huesp;
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.tipoHab=tipoHab;
        this.registro=registro;
        this.num=num;
        this.salida=salida;
        this.verif=verif;
        this.aux=aux;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getVerif() {
        return verif;
    }

    public void setVerif(int verif) {
        this.verif = verif;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHuesp() {
        return huesp;
    }

    public void setHuesp(int huesp) {
        this.huesp = huesp;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getTotalApxPago() {
        return totalApxPago;
    }

    public void setTotalApxPago(double totalApxPago) {
        this.totalApxPago = totalApxPago;
    }

    public double getTotalApx() {
        return totalApx;
    }

    public void setTotalApx(double totalApx) {
        this.totalApx = totalApx;
    }
    
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    public int getFecha() {
        return fecha;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

     public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

   public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getCaja() {
        return caja;
    }

    public void imprimir() {
    
    }
    public void cancelar(){
        String deseo=" ";
        System.out.println("***¿Señor cliente, está seguro que quiere cancelar la reserva?***");
        System.out.println("***¡¡¡NO se le harán las devoluciones del primer pago!!!***");
        deseo=lector.next();
        if("si".equals(deseo)){
             System.out.println("--------¡¡Muchas gracias por visitarnos!!--------"
                + "\n----------------¡¡Hasta pronto!!-----------------");
        }else if("no".equals(deseo)){
            facturacion();
        }
    }
    public void checkout(){
        int aux2=0, aux3, aux4, aux5, aux6,aux7;
        System.out.println("Digite el número del día actual, de salida, por favor");
        setSalida(lector.nextInt());
        if(getSalida()!=getAux()){
            System.out.println("Señor cliente, la fecha de check-out es diferente");
            
            if(getVerif()==1){
                aux3=getSalida()+31;
                aux4=getAux()+31;
                aux2=aux3-aux4;
                if(aux2<0){
                    aux2=aux2*-1;
                    System.out.println("Señor cliente usted se quedó "+aux2+" dias "
                            + "menos de los que se habían acordado");
                    aux6=(int) getTotalApx();
                    aux6/=getTiempo();
                    System.out.println("Se le cobrará "+aux6+" de menos, esperamos lo entienda");
                    aux5=getTiempo();
                    aux5-=aux2;
                    setTiempo(aux5);
                    
                    aux6*=aux5;
                    setPrecio(aux6);
                }else{
                    System.out.println("Señor cliente usted se quedó "+aux2+" dias "
                            + "mas de los que se habían acordado");
                    aux6=(int) getTotalApx();
                    
                    aux6/=getTiempo();
                    System.out.println("Se le cobrará "+(aux6*aux2)+" de más, esperamos lo entienda");
                    
                    aux5=getTiempo();
                    aux5+=aux2;
                    setTiempo(aux5);
                    
                    aux6*=aux5;
                    setPrecio(aux6);
                }
            }else{
                aux3=getSalida();
                aux4=getAux();
                aux2=aux3-aux4;
                if(aux2<0){
                    aux2=aux2*-1;
                    System.out.println("Señor cliente usted se quedó "+aux2+" dias "
                            + "menos de los que se habían acordado");
                    aux6=(int) getTotalApx();
                    aux6/=getTiempo();
                    System.out.println("Se le cobrará "+aux6+" de menos, esperamos lo entienda");
                    aux5=getTiempo();
                    aux5-=aux2;
                    setTiempo(aux5);
                    aux6*=aux5;
                    setTiempo(aux6);
                    
                }else{
                    System.out.println("Señor cliente usted se quedó "+aux2+" dias "
                            + "mas de los que se habían acordado");
                    aux6=(int) getTotalApx();
                    
                    aux6/=getTiempo();
                    System.out.println("Se le cobrará "+(aux6*aux2)+" de más, esperamos lo entienda");
                    
                    aux5=getTiempo();
                    aux5+=aux2;
                    setTiempo(aux5);
                    
                    aux6*=aux5;
                    setPrecio(aux6);
                }
            }
        }
        aux7=(int) (getPrecio()-getTotalApx());
        if(aux7<0){
            aux6=aux7;
            aux6*=-1;
            setPrecio(aux6);
        }
            System.out.println(" ---- Factura ----\n");
            System.out.println(" --- Información del titular ---\n");
            System.out.println("  Nombre---------------- "+getNombre()+" "+getApellido());
            System.out.println("  N°identificación------ "+getId());
            System.out.println("  N° de huespedes------- "+getHuesp());
            System.out.println("  Dias de estancía------ "+getTiempo());
            System.out.println("  N° de Habitaciones---- "+getNum());
            System.out.println("  N° Registro----------- "+getCaja());
            System.out.println("  Total a pagar--------- "+getPrecio());
            
            pagarTodo();
            
    }
    
    public void pagarTodo(){
    
        System.out.println("Señor cliente, para poder retirarse debe cancelar el total a pagar, lo cual es: "+getPrecio());
        System.out.println("Digite la suma que va a pagar: ");
        pagarCheckout = lector.nextDouble();
            
        if(pagarCheckout == getPrecio()){
            
            System.out.println("**Pagado**");
            
            System.out.println("---MUCHAS GRACIAS POR UTILIZAR NUESTRO SERVICIO---");
            System.out.println("             ----HASTA PRONTO----");
                
        }else if(pagarCheckout < getPrecio() || pagarCheckout <0){
            
            System.out.println("Está dando un monto inferior al que debe pagar, por favor pague completo");
            pagarTodo();    
                
        }else if(pagarCheckout > getPrecio()){
        
            double cambio=0;
            
            cambio = pagarCheckout-getPrecio();
            
            System.out.println("**Pagado**");
            
            System.out.println("Su cambio es: "+cambio);
            
            System.out.println("---MUCHAS GRACIAS POR UTILIZAR NUESTRO SERVICIO---");
            System.out.println("             ----HASTA PRONTO----");
        
        }
        
    }
    
    public void nregistro(){
       setCaja(10000);
       setCaja((getHuesp()*10000)+(getFecha()*100)+getNum());
       
       
    }
    public void checkIn(){
        System.out.println("Digite el número del día actual, de llegada, por favor");
        setFecha(lector.nextInt());
        if(getFecha()<0){
            System.out.println("Número no valido, digite otro por favor");
            checkIn();
        }
        setAux(getTiempo()+getFecha());
        
        if (getAux()>31){
            aux-=31;
            System.out.println("El día de Check-out es: "+getAux()+" del siguiente mes");
            setVerif(1);
        }else{
            System.out.println("El día de Check-out es: "+getAux());
        }
        
        nregistro();
        
        System.out.println("  ---- Pre-Factura ----");

            System.out.println(" --- Información del titular ---");
            System.out.println("  Nombre---------------- "+getNombre()+" "+getApellido());
            System.out.println("  N°identificación------ "+getId());
            System.out.println("  N° de huespedes------- "+getHuesp());
            System.out.println("  Dias de estancía------ "+getTiempo());
            System.out.println("  N° de Habitaciones---- "+getNum());
            System.out.println("  N° Registro----------- "+getCaja());
            System.out.println("  Total aproximado------ "+getTotalApx());
            System.out.println("  \nTenga en cuenta, señor cliente, que el total aproximado no "
                    + "tiene relación con lo que ya se pago");
        facturacion2();
    }
    public void abono(){
        double aux1=0, aux2=0;
        System.out.println("Debe pagar la mitad del valor aproximado para poder hospedarse");
        aux1=getTotalApx()/2;
        System.out.println(aux1);
        System.out.println("Digite la cantidad a pagar, por favor");
        setTotalApxPago(lector.nextDouble());
        if(getTotalApxPago()>aux1){
        aux2=getTotalApxPago()-aux1;
            System.out.println("Pagado");
            System.out.println("Su cambio es: "+aux2);
        }else if(getTotalApxPago()==aux1){
            System.out.println("Pagado");
        
        }else if(getTotalApxPago()<aux1||getTotalApxPago()<0){
            System.out.println("Digite un valor más alto, por favor");
            abono();
        }
        facturacion();
    }
    
    public void facturacion2(){
    
        System.out.println("***¿Qué desea hacer?***");
        System.out.println("1.Check-in.\n"+"2.Check-out.\n"+"3.Informacion de los empleados.");
        eleccion = lector.nextInt();
        
        switch(eleccion){
        
            case 1:
        {
            
            if (auxDeseo==1){
                System.out.println("Señor cliente ya realizó el Check-in, prosiga con el check-out");
                facturacion2();
                
            }else{
                auxDeseo=1;
                checkIn();
                
            }
        }
                
                break;
            
            case 2:
                if (auxDeseo==0){
                    System.out.println("Debe hacer el Check-In para hacer la operación");
                    facturacion();
                }else {
                    checkout();
                }
                break;
            
            case 3:
                    emple.Apellidos();
                    emple.Nombres();
                    emple.Cargos();
                    emple.CedulaEmp();
                    System.out.println("Nombres: "+"        Cargo:");
                
                for(int j = 0; j < 20; j++){
                
                    System.out.println(emple.nombres[j]+emple.apellidos[j]+"---"+emple.cargos[j]);
                    
                }
                
                facturacion2();
                
                break;
        
        }
        
    }
    
    public void facturacion(){
        
        System.out.println("***¿Qué desea hacer?***");
        System.out.println("1.Check-in.\n"+"2.Check-out.\n"+"3.Cancelar reseva\n"+"4.Informacion de los empleados.");
        eleccion = lector.nextInt();
        
        switch(eleccion){
        
            case 1:
        {
            
            if (auxDeseo==1){
                System.out.println("Señor cliente ya realizó el Check-in, prosiga con el check-out");
                facturacion2();
                
            }else{
                auxDeseo=1;
                checkIn();
                
                
            }
        }
                
                break;
            
            case 2:
                if (auxDeseo==0){
                    System.out.println("Debe hacer el Check-In para hacer la operación");
                    facturacion();
                }else {
                    checkout();
                }
                break;
            
            case 3:
                cancelar();
                break;
            
            case 4:
                    emple.Apellidos();
                    emple.Nombres();
                    emple.Cargos();
                    emple.CedulaEmp();
                    System.out.println("Nombres: "+"        Cargo:");
                
                for(int j = 0; j < 20; j++){
                
                    System.out.println(emple.nombres[j]+emple.apellidos[j]+"---"+emple.cargos[j]);
                    
                }
                
                facturacion();
                
                break;
        
        }
        
        
    }
 
   
}
