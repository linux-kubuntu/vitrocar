package com.vitrocar.model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1



/**
 * DomExtran generated by hbm2java
 */
public class DomExtran  implements java.io.Serializable {


     private int idDom;
     private Cliente cliente;
     private Pais pais;
     private String calle;
     private Integer num;
     private String colonia;
     private Integer cp;
     private String estado;
     private String telefono;
     private String ciudad;
     private String municipio;

    public DomExtran() {
    }

	
    public DomExtran(int idDom) {
        this.idDom = idDom;
    }
    public DomExtran(int idDom, Cliente cliente, Pais pais, String calle, Integer num, String colonia, Integer cp, String estado, String telefono, String ciudad, String municipio) {
       this.idDom = idDom;
       this.cliente = cliente;
       this.pais = pais;
       this.calle = calle;
       this.num = num;
       this.colonia = colonia;
       this.cp = cp;
       this.estado = estado;
       this.telefono = telefono;
       this.ciudad = ciudad;
       this.municipio = municipio;
    }
   
    public int getIdDom() {
        return this.idDom;
    }
    
    public void setIdDom(int idDom) {
        this.idDom = idDom;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public Integer getCp() {
        return this.cp;
    }
    
    public void setCp(Integer cp) {
        this.cp = cp;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }




}


