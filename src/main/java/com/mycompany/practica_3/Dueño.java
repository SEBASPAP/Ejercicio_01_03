/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Dueño {
    String nombre;
    int cedula;
    int telefono;
    int fNacimiento;

    public Dueño(String nombre, int cedula, int telefono, int fNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    
    public int CalcularEdad(){
        return 22;
    }
}
