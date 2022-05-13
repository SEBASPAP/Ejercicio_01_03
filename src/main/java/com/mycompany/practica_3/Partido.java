/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Partido {
    String Estadio;
    String Ubicacion;
    String Competicion;
    Equipo equipo;
    jugador jugador;

    public Partido(String Estadio, String Ubicacion, String Competicion, Equipo equipo, jugador jugador) {
        this.Estadio = Estadio;
        this.Ubicacion = Ubicacion;
        this.Competicion = Competicion;
        this.equipo = equipo;
        this.jugador = jugador;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getCompeticion() {
        return Competicion;
    }

    public void setCompeticion(String Competicion) {
        this.Competicion = Competicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public jugador getJugador() {
        return jugador;
    }

    public void setJugador(jugador jugador) {
        this.jugador = jugador;
    }
    
    public String ObtenerFase(){
        return "Semifinal vs FC Barcelona";
    }
}
