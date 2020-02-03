package modelos;
// Generated 1/02/2020 07:18:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CasaCreada generated by hbm2java
 */
public class CasaCreada  implements java.io.Serializable {


     private int casaAdicionalId;
     private CasaBuilder casaBuilder;
     private Set empleadoCreaCasas = new HashSet(0);
     private Set casaCreadaAdicionals = new HashSet(0);
     private Set cotizacions = new HashSet(0);

    public CasaCreada() {
    }

	
    public CasaCreada(int casaAdicionalId, CasaBuilder casaBuilder) {
        this.casaAdicionalId = casaAdicionalId;
        this.casaBuilder = casaBuilder;
    }
    public CasaCreada(int casaAdicionalId, CasaBuilder casaBuilder, Set empleadoCreaCasas, Set casaCreadaAdicionals, Set cotizacions) {
       this.casaAdicionalId = casaAdicionalId;
       this.casaBuilder = casaBuilder;
       this.empleadoCreaCasas = empleadoCreaCasas;
       this.casaCreadaAdicionals = casaCreadaAdicionals;
       this.cotizacions = cotizacions;
    }
   
    public int getCasaAdicionalId() {
        return this.casaAdicionalId;
    }
    
    public void setCasaAdicionalId(int casaAdicionalId) {
        this.casaAdicionalId = casaAdicionalId;
    }
    public CasaBuilder getCasaBuilder() {
        return this.casaBuilder;
    }
    
    public void setCasaBuilder(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }
    public Set getEmpleadoCreaCasas() {
        return this.empleadoCreaCasas;
    }
    
    public void setEmpleadoCreaCasas(Set empleadoCreaCasas) {
        this.empleadoCreaCasas = empleadoCreaCasas;
    }
    public Set getCasaCreadaAdicionals() {
        return this.casaCreadaAdicionals;
    }
    
    public void setCasaCreadaAdicionals(Set casaCreadaAdicionals) {
        this.casaCreadaAdicionals = casaCreadaAdicionals;
    }
    public Set getCotizacions() {
        return this.cotizacions;
    }
    
    public void setCotizacions(Set cotizacions) {
        this.cotizacions = cotizacions;
    }




}

