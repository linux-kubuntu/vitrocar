package model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String nombre;
     private String telefono;
     private Set<DomExtran> domExtrans = new HashSet<DomExtran>(0);
     private Set<Facturacion> facturacions = new HashSet<Facturacion>(0);
     private Set<ClienteAuto> clienteAutos = new HashSet<ClienteAuto>(0);
     private Set<DatosCliente> datosClientes = new HashSet<DatosCliente>(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente(int idCliente, String nombre, String telefono, Set<DomExtran> domExtrans, Set<Facturacion> facturacions, Set<ClienteAuto> clienteAutos, Set<DatosCliente> datosClientes) {
       this.idCliente = idCliente;
       this.nombre = nombre;
       this.telefono = telefono;
       this.domExtrans = domExtrans;
       this.facturacions = facturacions;
       this.clienteAutos = clienteAutos;
       this.datosClientes = datosClientes;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set<DomExtran> getDomExtrans() {
        return this.domExtrans;
    }
    
    public void setDomExtrans(Set<DomExtran> domExtrans) {
        this.domExtrans = domExtrans;
    }
    public Set<Facturacion> getFacturacions() {
        return this.facturacions;
    }
    
    public void setFacturacions(Set<Facturacion> facturacions) {
        this.facturacions = facturacions;
    }
    public Set<ClienteAuto> getClienteAutos() {
        return this.clienteAutos;
    }
    
    public void setClienteAutos(Set<ClienteAuto> clienteAutos) {
        this.clienteAutos = clienteAutos;
    }
    public Set<DatosCliente> getDatosClientes() {
        return this.datosClientes;
    }
    
    public void setDatosClientes(Set<DatosCliente> datosClientes) {
        this.datosClientes = datosClientes;
    }




}


