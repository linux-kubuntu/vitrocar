package com.vitrocar.model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Poliza generated by hbm2java
 */
public class Poliza  implements java.io.Serializable {


     private String idPoliza;
     private Double deducible;
     private String cobertura;
     private Date fechaInic;
     private Date fechaFin;
     private Set<Siniestro> siniestros = new HashSet<Siniestro>(0);
     private Set<Inciso> incisos = new HashSet<Inciso>(0);

    public Poliza() {
    }

	
    public Poliza(String idPoliza) {
        this.idPoliza = idPoliza;
    }
    public Poliza(String idPoliza, Double deducible, String cobertura, Date fechaInic, Date fechaFin, Set<Siniestro> siniestros, Set<Inciso> incisos) {
       this.idPoliza = idPoliza;
       this.deducible = deducible;
       this.cobertura = cobertura;
       this.fechaInic = fechaInic;
       this.fechaFin = fechaFin;
       this.siniestros = siniestros;
       this.incisos = incisos;
    }
   
    public String getIdPoliza() {
        return this.idPoliza;
    }
    
    public void setIdPoliza(String idPoliza) {
        this.idPoliza = idPoliza;
    }
    public Double getDeducible() {
        return this.deducible;
    }
    
    public void setDeducible(Double deducible) {
        this.deducible = deducible;
    }
    public String getCobertura() {
        return this.cobertura;
    }
    
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    public Date getFechaInic() {
        return this.fechaInic;
    }
    
    public void setFechaInic(Date fechaInic) {
        this.fechaInic = fechaInic;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Set<Siniestro> getSiniestros() {
        return this.siniestros;
    }
    
    public void setSiniestros(Set<Siniestro> siniestros) {
        this.siniestros = siniestros;
    }
    public Set<Inciso> getIncisos() {
        return this.incisos;
    }
    
    public void setIncisos(Set<Inciso> incisos) {
        this.incisos = incisos;
    }




}


