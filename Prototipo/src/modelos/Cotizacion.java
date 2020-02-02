package modelos;
// Generated 1/02/2020 07:18:57 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cotizacion generated by hbm2java
 */
public class Cotizacion  implements java.io.Serializable {


     private int cotizacionId;
     private CasaCreada casaCreada;
     private Cliente cliente;
     private Date fecha;
     private double precio;

    public Cotizacion() {
    }

    public Cotizacion(int cotizacionId, CasaCreada casaCreada, Cliente cliente, Date fecha, double precio) {
       this.cotizacionId = cotizacionId;
       this.casaCreada = casaCreada;
       this.cliente = cliente;
       this.fecha = fecha;
       this.precio = precio;
    }
   
    public int getCotizacionId() {
        return this.cotizacionId;
    }
    
    public void setCotizacionId(int cotizacionId) {
        this.cotizacionId = cotizacionId;
    }
    public CasaCreada getCasaCreada() {
        return this.casaCreada;
    }
    
    public void setCasaCreada(CasaCreada casaCreada) {
        this.casaCreada = casaCreada;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }




}


