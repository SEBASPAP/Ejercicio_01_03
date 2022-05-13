/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Matricula {
    int Serie;
    int Fecha;
    String Tipo;

    public Matricula(int Serie, int Fecha, String Tipo) {
        this.Serie = Serie;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    int fActual=2022;
    
    public double TiempoUso(){
        var fActual=2022;
        var fCompra=2005;
        var FV = fActual-fCompra;
        return FV;
    }
}
