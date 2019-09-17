package hotel;

public class Habitaciones {
    
    private int sencilla, doble, suite, dobleconModi, disponible;
    
    
    public Habitaciones() {
        
        sencilla = 0;
        doble = 0;
        suite = 0;
        dobleconModi = 0;
        disponible=0;
    }
    
    public Habitaciones(int sencilla, int doble, int suite, int dobleconModi, int disponible) {
        
        this.sencilla = sencilla;
        this.doble = doble;
        this.suite = suite;
        this.dobleconModi = dobleconModi;
        this.disponible=disponible;
    }
    
    public void setSencilla(int sencilla) {
        this.sencilla = sencilla;
    }
    
    public int getSencilla() {
        return sencilla;
    }
    
    public void setDoble(int doble) {
        this.doble = doble;
    }
    
    public int getDoble() {
        return doble;
    }
    
    public void setSuite(int suite) {
        this.suite = suite;
    }
    
    public int getSuite() {
        return suite;
    }
    
    public void setDobleconModi(int dobleconModi) {
        this.dobleconModi = dobleconModi;
    }
    
    public int getDobleconModi() {
        return dobleconModi;
    }
    public void setDisponibles(int disponibles){
        this.disponible=disponibles;
    }
    public int getDisponibles(){
        return disponible;
    }
    
    public void sencilla() {
                       
        final long costoSencilla=10000;
        int numeroCamas = 1;
        int baños = 1;
        int miniBar =1;
        String estaReservado;
        
        String televisor = "televisor LG 40 pulgadas";
        
        System.out.println("** Números de camas: "+numeroCamas);
        System.out.println("** número de baños: "+baños);
        System.out.println("** La habitación contiene "+miniBar+" miniBar totalmente lleno.");
        System.out.println("** La habitación cuenta con un "+televisor+".");
        System.out.println("--- Esta habitación tiene un costo de $"+costoSencilla +" por noche (varia según descuentos)--- \n");
    
    }
    
    
    public void doble() {
        String habDoble[] = new String[10];
        
        final long costoDoble=14000;
        int numeroCamas = 2; 
        int baños = 1;
        int miniBar =1;
        String estaReservado;
        
        String televisor = "televisor Samsung 50 pulgadas HD 1080p";
        String vistas = "vistas a la ciudad";
        String calefaccion = "calefactor eléctrico de 2500 voltios";
       
        System.out.println("** números de camas: "+numeroCamas+" las cuales son sencillas.");
        System.out.println("** número de baños: "+baños);
        System.out.println("** "+miniBar+" miniBar totalmente lleno.");
        System.out.println("** "+televisor+".");
        System.out.println("** "+vistas+" con un hermoso paisaje.");
        System.out.println("** "+calefaccion+" lo cual proporciona más comodidad.");
        
        System.out.println("--- Esta habitación tiene un costo de $"+costoDoble+" por noche (varia según descuentos) ---  \n");
    
       
    }   
    
    public void suite() {
        String habSuite[] = new String[10]; 
        
        final long costoSuite=20000;
        int numeroCamas = 2;
        int baños = 2;
        int miniBar =2;
        
        String televisor = "televisor Samsung 80 pulgadas 4K HD 1080p";
        String vistas = "vistas a la ciudad con enfoque hacia el atardecer";
        String calefaccion = "calefactor eléctrico de cuarzo con 2500 voltios";
        
        System.out.println("** números de camas: "+numeroCamas+" las cuales son dobles");
        System.out.println("** número de baños: "+baños+", además de contar con un jaccuzi.");
        System.out.println("** "+miniBar+" miniBares totalmente llenos.");
        System.out.println("** "+televisor+".");
        System.out.println("** "+vistas+".");
        System.out.println("** "+calefaccion+" lo cual proporciona más comodidad.");
        
        System.out.println("--- Esta habitación tiene un costo de $"+costoSuite+" por noche (varia según descuentos)---  \n");
        
    }
}
