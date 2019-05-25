/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_3;

/**
 *
 * @author super
 */
//V7
public class Lab_3_1 {

    public static void main(String[] args) {
        double[] arr = {-3.81, 1.32, -1.75, -4.3, -6.66, -0.32, -3.95, -2.55, -0.32, 5, -4.3, -3.81};
        double[] arrNew = new double[arr.length];
        int counter = 0;
        boolean checkSame = false;

        System.out.println("Initial array");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] & i != j) {
                    checkSame = false;
                }
            }
            if (!checkSame) {
                arrNew[counter++] = arr[i];
            }
            checkSame = true;
        }
        System.out.println();
        System.out.println("Final array:");
        for (int i = 0; i < arrNew.length & arrNew[i] != 0; i++) {
            System.out.print(arrNew[i] + ", ");
        }
    }
}
