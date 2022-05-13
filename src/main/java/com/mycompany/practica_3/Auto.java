/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Auto {
    String Color;
    String Modelo;
    int Placa;
    int Anio;
    Matricula Matricula;
    Dueño Dueño;

    public Auto(String Color, String Modelo, int Placa, int Anio, Matricula Matricula, Dueño Dueño) {
        this.Color = Color;
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Anio = Anio;
        this.Matricula = Matricula;
        this.Dueño = Dueño;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public Matricula getMatricula() {
        return Matricula;
    }

    public void setMatricula(Matricula Matricula) {
        this.Matricula = Matricula;
    }

    public Dueño getDueño() {
        return Dueño;
    }

    public void setDueño(Dueño Dueño) {
        this.Dueño = Dueño;
    }
    
    public String tipoVehiculo(){
        return "Camioneta";
    }
    
    
}
