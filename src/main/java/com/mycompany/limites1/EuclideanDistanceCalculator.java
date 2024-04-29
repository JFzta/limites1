/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.limites1;

/**
 *
 * @author juanz
 */
public class EuclideanDistanceCalculator implements DistanceCalculator {
    @Override
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        // Usando la fórmula de distancia euclidiana
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}