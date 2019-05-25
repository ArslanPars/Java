/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_2;

/**
 *
 * @author super
 */
public class Audit {

    public static void main(String[] args) {
        int n = 15;
        double u = 1, sum = 0;
        double[] arr = new double[n];
        arr[0] = 1;

        System.out.printf("a[0]:%f\n", arr[0]);
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + u / (u + 1);
            u++;
            if (i < 10) {
                sum += arr[i];
            }
            System.out.printf("a[%d]:%f\n", i, arr[i]);
        }
        System.out.printf("Sum:" + sum);
    }
}
