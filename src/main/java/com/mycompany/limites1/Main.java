/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.limites1;

/**
 *
 * @author juanz
 */
public class Main {
    public static void main(String[] args) {
        // Usamos el calculador de distancia euclidiana
        DistanceCalculator calculator = new EuclideanDistanceCalculator();
        MapService mapService = new MapService(calculator);

        double distance = mapService.getDistance(0, 0, 3, 4);
        System.out.println("La distancia es: " + distance);
    }
}