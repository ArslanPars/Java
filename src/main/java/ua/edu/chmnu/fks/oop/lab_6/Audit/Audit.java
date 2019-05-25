/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_6.Audit;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

/**
 *
 * @author super
 */
public class Audit {

    public static void main(String[] args) throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelogram par1 = new Parallelogram(4, 6, 12);
        System.out.println("Par1 perimeter = " + par1.perimeter());
        System.out.println("Par1 square = " + par1.square());

        Parallelepiped parp1 = new Parallelepiped(4, 6, 12, 10, 0.5, 0.4);
        System.out.println("Parp1 perimeter = " + parp1.perimeter());
        System.out.println("Parp1 square = " + parp1.square());
        System.out.println("Parp1 volume = " + parp1.volume());
    }

}
