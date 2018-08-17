package model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Auto generated by hbm2java
 */
public class Auto  implements java.io.Serializable {


     private int idAuto;
     private Marca marca;
     private TipoAuto tipoAuto;
     private String modelo;
     private Integer puertas;
     private Integer idAnio;
     private Set<AutoPieza> autoPiezas = new HashSet<AutoPieza>(0);
     private Set<ClienteAuto> clienteAutos = new HashSet<ClienteAuto>(0);

    public Auto() {
    }

	
    public Auto(int idAuto) {
        this.idAuto = idAuto;
    }
    public Auto(int idAuto, Marca marca, TipoAuto tipoAuto, String modelo, Integer puertas, Integer idAnio, Set<AutoPieza> autoPiezas, Set<ClienteAuto> clienteAutos) {
       this.idAuto = idAuto;
       this.marca = marca;
       this.tipoAuto = tipoAuto;
       this.modelo = modelo;
       this.puertas = puertas;
       this.idAnio = idAnio;
       this.autoPiezas = autoPiezas;
       this.clienteAutos = clienteAutos;
    }
   
    public int getIdAuto() {
        return this.idAuto;
    }
    
    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public TipoAuto getTipoAuto() {
        return this.tipoAuto;
    }
    
    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getPuertas() {
        return this.puertas;
    }
    
    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
    public Integer getIdAnio() {
        return this.idAnio;
    }
    
    public void setIdAnio(Integer idAnio) {
        this.idAnio = idAnio;
    }
    public Set<AutoPieza> getAutoPiezas() {
        return this.autoPiezas;
    }
    
    public void setAutoPiezas(Set<AutoPieza> autoPiezas) {
        this.autoPiezas = autoPiezas;
    }
    public Set<ClienteAuto> getClienteAutos() {
        return this.clienteAutos;
    }
    
    public void setClienteAutos(Set<ClienteAuto> clienteAutos) {
        this.clienteAutos = clienteAutos;
    }




}


