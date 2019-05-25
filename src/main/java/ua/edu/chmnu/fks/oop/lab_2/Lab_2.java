/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
//V21
public class Lab_2 {

    public static void main(String[] args) {
        System.out.println("1. Розрахувати функцію з заданими параметрами");
        System.out.println("2. Розрахувати функцію з випадковими параметрами");
        System.out.println("3. Обчислити екстремуми");
        try ( Scanner in = new Scanner(System.in)) {
            double y;
            int s = in.nextInt();
            switch (s) {
                case 1:
                    y = f(2.43, 1.13, 4.27, -3.1);
                    System.out.println("y = " + y);
                    break;
                case 2:
                    double a,
                     b,
                     c,
                     x;
                    do {
                        a = Math.random() * 10;
                        b = Math.random() * 10;
                        c = Math.random() * 10;
                        x = Math.random() * 10;
                    } while (1 / Math.tan(c - b / x) < 0);
                    y = f(a, b, c, x);
                    System.out.println("y = " + y);
                    break;
                case 3:
                    int N = 200;
                    double xl = -8,
                     x2 = 2,
                     h = (x2 - xl) / N;
                    for (int i = 1; i < N; ++i) {
                        double xx = xl + i * h;
                        double y1 = f(2.43, 1.13, 4.27, xx - h), y2 = f(2.43, 1.13, 4.27, xx + h);
                        y = f(2.43, 1.13, 4.27, xx);
                        double dy1 = y - y1, dy2 = y2 - y;
                        if (dy1 < 0 && dy2 > 0) {
                            System.out.printf("Min (%.3f, %.3f)\n", xx, y);
                        } else if (dy1 > 0 && dy2 < 0) {
                            System.out.printf("Max (%.3f, %.3f)\n", xx, y);
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Неверные данные");
        }
    }

    private static double f(double a, double b, double c, double x) {
        return Math.pow(a + Math.pow(x, 2), 1 / 3) / (1 / Math.tan(c - b / x));
    }
}
