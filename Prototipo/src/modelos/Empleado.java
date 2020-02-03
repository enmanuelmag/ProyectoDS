package modelos;
// Generated 2/02/2020 10:33:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private int empleadoId;
     private Cargo cargo;
     private Direccion direccion;
     private Estadocivil estadocivil;
     private String nombres;
     private String apellidos;
     private String telefono;
     private String correo;
     private String activo;
     private String usuario;
     private String contrasena;
     private Set empleadocreacasas = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(int empleadoId, Cargo cargo, Direccion direccion, Estadocivil estadocivil, String nombres, String apellidos, String telefono, String correo, String activo) {
        this.empleadoId = empleadoId;
        this.cargo = cargo;
        this.direccion = direccion;
        this.estadocivil = estadocivil;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = activo;
    }
    public Empleado(int empleadoId, Cargo cargo, Direccion direccion, Estadocivil estadocivil, String nombres, String apellidos, String telefono, String correo, String activo, String usuario, String contrasena, Set empleadocreacasas) {
       this.empleadoId = empleadoId;
       this.cargo = cargo;
       this.direccion = direccion;
       this.estadocivil = estadocivil;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.telefono = telefono;
       this.correo = correo;
       this.activo = activo;
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.empleadocreacasas = empleadocreacasas;
    }
   
    public int getEmpleadoId() {
        return this.empleadoId;
    }
    
    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Estadocivil getEstadocivil() {
        return this.estadocivil;
    }
    
    public void setEstadocivil(Estadocivil estadocivil) {
        this.estadocivil = estadocivil;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getActivo() {
        return this.activo;
    }
    
    public void setActivo(String activo) {
        this.activo = activo;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Set getEmpleadocreacasas() {
        return this.empleadocreacasas;
    }
    
    public void setEmpleadocreacasas(Set empleadocreacasas) {
        this.empleadocreacasas = empleadocreacasas;
    }




}


