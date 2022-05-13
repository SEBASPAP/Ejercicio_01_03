/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Equipo {
    String nombre;
    String equipacion;
    String tecnico;
    int Jugadores ;

    public Equipo(String nombre, String equipacion, String tecnico, int Jugadores) {
        this.nombre = nombre;
        this.equipacion = equipacion;
        this.tecnico = tecnico;
        this.Jugadores = Jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipacion() {
        return equipacion;
    }

    public void setEquipacion(String equipacion) {
        this.equipacion = equipacion;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getJugadores() {
        return Jugadores;
    }

    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
    }
    
    public String Amonestados(){
        return "No esta amonestado";
    }
}
