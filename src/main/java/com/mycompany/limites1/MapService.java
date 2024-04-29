/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.limites1;

/**
 *
 * @author juanz
 */
public class MapService {
    private DistanceCalculator distanceCalculator;

    // Constructor que recibe un DistanceCalculator
    public MapService(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }

    public double getDistance(double x1, double y1, double x2, double y2) {
        return distanceCalculator.calculateDistance(x1, y1, x2, y2);
    }
}