package modelos;
// Generated 2/02/2020 10:33:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Adicionalpiso generated by hbm2java
 */
public class Adicionalpiso  implements java.io.Serializable {


     private Integer adicionalPisoId;
     private String descripcion;
     private Double precio;
     private Set casacreadaAdicionals = new HashSet(0);

    public Adicionalpiso() {
    }

    public Adicionalpiso(String descripcion, Double precio, Set casacreadaAdicionals) {
       this.descripcion = descripcion;
       this.precio = precio;
       this.casacreadaAdicionals = casacreadaAdicionals;
    }
   
    public Integer getAdicionalPisoId() {
        return this.adicionalPisoId;
    }
    
    public void setAdicionalPisoId(Integer adicionalPisoId) {
        this.adicionalPisoId = adicionalPisoId;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Set getCasacreadaAdicionals() {
        return this.casacreadaAdicionals;
    }
    
    public void setCasacreadaAdicionals(Set casacreadaAdicionals) {
        this.casacreadaAdicionals = casacreadaAdicionals;
    }

@Override
    public String toString() {
        return descripcion;
    }


}


