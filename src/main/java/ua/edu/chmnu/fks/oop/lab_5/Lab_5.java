/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_5;

/**
 *
 * @author super
 */
//V5
public class Lab_5 {

    public static void main(String[] args) {
        Point a1 = new Point(1, 1, 0);
        Point b1 = new Point(1, 4, 0);
        Point c1 = new Point(5, 1, 0);
        Point d1 = new Point(5, 4, 0);
        Point e1 = new Point(1, 1, 7);
        Point f1 = new Point(1, 4, 7);
        Point g1 = new Point(5, 1, 7);
        Point h1 = new Point(5, 4, 7);

        Point a2 = new Point(1, 1, 0);
        Point b2 = new Point(1, 4, 0);
        Point c2 = new Point(5, 1, 0);
        Point d2 = new Point(5, 4, 0);
        Point e2 = new Point(1, 1, 5);
        Point f2 = new Point(1, 4, 5);
        Point g2 = new Point(5, 1, 5);
        Point h2 = new Point(5, 4, 5);

        Parall p1 = new Parall(a1, b1, c1, d1, e1, f1, g1, h1);
        Parall p2 = new Parall(a2, b2, c2, d2, e2, f2, g2, h2);

        double p1Perimeter = p1.volume();
        double p1Square = p1.square();
        double p2Perimeter = p2.volume();
        double p2Square = p2.square();

        System.out.printf("\nОбъем p1: %.2f", p1Perimeter);
        System.out.printf("\nПлощадь p1: %.2f", p1Square);
        System.out.printf("\nОбъем p2 %.2f", p2Perimeter);
        System.out.printf("\nПлощадь p2: %.2f", p2Square);
        System.out.println();
        p1.compare(p1, p2);
    }
}

class Point {

    double x;
    double y;
    double z;

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Parall {

    double ab, ae, ad;

    Parall(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
        ab = sideLength(a, b);
        ae = sideLength(b, e);
        ad = sideLength(a, d);

    }

    public double sideLength(Point a, Point b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2) + Math.pow((b.z - a.z), 2));
    }

    public double volume() {
        return ab * ae * ad;
    }

    public double square() {
        return 2 * (ae * ab + ab * ad + ae * ad);
    }

    public void compare(Parall a, Parall b) {
        if (a.volume() > b.volume() && a.square() > b.square()) {
            System.out.println("Объем параллепипеда p1 больше чем объем параллепипеда p2");
            System.out.println("Площадь параллепипеда p1 больше чем площадь параллепипеда p2");
        } else if (a.volume() < b.volume() && a.square() < b.square()) {
            System.out.println("Объем параллепипеда p2 больше чем объем параллепипеда p1");
            System.out.println("Площадь параллепипеда p2 больше чем площадь параллепипеда p1");
        }
        else{
            System.out.println("Объем параллепипеда p2 равна объему параллепипеда p1");
            System.out.println("Площадь параллепипеда p2 равна площади параллепипеда p1");
        }
    }
}
