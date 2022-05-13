/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_3;

/**
 *
 * @author paulp
 */
public class Practica_3 {

    
    public static void main(String[] args) {
        
       System.out.println("RELACION 1 PARTIDO/EQUIPO/JUGADOR");              
       jugador  jugador1 = new jugador("Robert", "Colombiano", "Extremo Drecho", 15); 
       System.out.println("El jugador es delantero: "+jugador1.Titular());
       
       Equipo equipo1 = new Equipo("Bayer Munich","Titular","Julian Nagelsmann",11);
       System.out.println("El jugador esta amonestado: "+equipo1.Amonestados());
       
       Partido partido1 = new Partido("Allianz Arena","Alemani","Champion League",equipo1,jugador1);
       System.out.println("El equipo se encuentra en: "+partido1.ObtenerFase());
       
       
       System.out.println("\nRELACION 2 AUTO/MATRICULA/DUEÑO");
       Dueño dueño1 = new Dueño("Sebastian", 15559354 ,246651515, 1995);
       System.out.println("Su edad es de:"+dueño1.CalcularEdad());
       
       Matricula matricula1 = new Matricula(256423,2022,"Profesional");
       System.out.println("Su tiempo en uso es de: "+matricula1.TiempoUso()+" anios");
       
       Auto auto1 = new Auto ("Azul","Doble Cabina", 3568 , 2018,matricula1,dueño1);
       System.out.println(" EL tipo es: "+auto1.tipoVehiculo());
       
    }
}
