/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_5;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author super
 */
public class Lab_5_Test {

    Point a = new Point(3, 2, 1);
    Point b = new Point(5, 4, 1);
    Point c = new Point(10, 4, 1);
    Point d = new Point(8, 2, 1);
    Point e = new Point(3, 2, 3);
    Point f = new Point(5, 4, 3);
    Point g = new Point(10, 4, 3);
    Point h = new Point(8, 2, 3);
    Parall p = new Parall(a, b, c, d, e, f, g, f);

    @Test
    public void sideLengthTest() {
        double sideLength = p.sideLength(a, b);
        double expected = 2.83;
        assertEquals(expected, round(sideLength, 2));
    }

    @Test
    public void volumeTest() {
        double volume = p.volume();
        double expected = 28.3;
        assertEquals(expected, round(volume, 2));
    }

    @Test
    public void squareTest() {
        double square = p.square();
        double expected = 10;
        assertEquals(expected, round(square, 2));
    }

    private double round(double number, int scale) {
        int pow = 10;
        for (int i = 1; i < scale; i++) {
            pow *= 10;
        }
        double tmp = number * pow;
        return (double) (int) ((tmp - (int) tmp) >= 0.5 ? tmp + 1 : tmp) / pow;
    }
}
