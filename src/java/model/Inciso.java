package model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1



/**
 * Inciso generated by hbm2java
 */
public class Inciso  implements java.io.Serializable {


     private String idInciso;
     private Poliza poliza;
     private String nombre;

    public Inciso() {
    }

	
    public Inciso(String idInciso) {
        this.idInciso = idInciso;
    }
    public Inciso(String idInciso, Poliza poliza, String nombre) {
       this.idInciso = idInciso;
       this.poliza = poliza;
       this.nombre = nombre;
    }
   
    public String getIdInciso() {
        return this.idInciso;
    }
    
    public void setIdInciso(String idInciso) {
        this.idInciso = idInciso;
    }
    public Poliza getPoliza() {
        return this.poliza;
    }
    
    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


