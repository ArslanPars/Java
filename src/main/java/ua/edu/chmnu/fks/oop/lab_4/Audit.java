/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_4;


import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author super
 */
public class Audit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        System.out.println("Факториал: " + factorial(n).toString());
    }

    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
