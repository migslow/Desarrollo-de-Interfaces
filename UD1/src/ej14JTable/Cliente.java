/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14JTable;

/**
 *
 * @author DAM2Alu10
 */
public class Cliente {
    String nombre, apellido, provincia, correo;
    int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String provincia, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.edad = edad;
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static String[] getCampos(){
        String campos[] = {"Nombre", "Apellidos", "Provincia", "Edad", "Correo"};
        return campos;
    }
    
    public String [] getValores(){
        String valores[] = {nombre, apellido, provincia, String.valueOf(edad), correo};
        return valores;
    }

}
