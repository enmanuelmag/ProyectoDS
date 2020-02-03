package modelos;
// Generated 2/02/2020 09:19:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Canton generated by hbm2java
 */
public class Canton  implements java.io.Serializable {


     private int cantonId;
     private Provincia provincia;
     private String descripcion;
     private Set direccions = new HashSet(0);

    public Canton() {
    }

	
    public Canton(int cantonId, Provincia provincia, String descripcion) {
        this.cantonId = cantonId;
        this.provincia = provincia;
        this.descripcion = descripcion;
    }
    public Canton(int cantonId, Provincia provincia, String descripcion, Set direccions) {
       this.cantonId = cantonId;
       this.provincia = provincia;
       this.descripcion = descripcion;
       this.direccions = direccions;
    }
   
    public int getCantonId() {
        return this.cantonId;
    }
    
    public void setCantonId(int cantonId) {
        this.cantonId = cantonId;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getDireccions() {
        return this.direccions;
    }
    
    public void setDireccions(Set direccions) {
        this.direccions = direccions;
    }




}


