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
public class Audit {

    public static void main(String[] args) {
        int[] arr = {5, 1, 23, 42, 9, 6, 14, };
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.printf("Array sorted: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
    }
}
