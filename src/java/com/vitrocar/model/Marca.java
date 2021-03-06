package com.vitrocar.model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca  implements java.io.Serializable {


     private int idMarca;
     private String nombre;
     private Set<Auto> autos = new HashSet<Auto>(0);

    public Marca() {
    }

	
    public Marca(int idMarca) {
        this.idMarca = idMarca;
    }
    public Marca(int idMarca, String nombre, Set<Auto> autos) {
       this.idMarca = idMarca;
       this.nombre = nombre;
       this.autos = autos;
    }
   
    public int getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Auto> getAutos() {
        return this.autos;
    }
    
    public void setAutos(Set<Auto> autos) {
        this.autos = autos;
    }




}


