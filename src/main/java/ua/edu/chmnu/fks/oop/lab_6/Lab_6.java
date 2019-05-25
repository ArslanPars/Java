package ua.edu.chmnu.fks.oop.lab_6;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

public class Lab_6 {

    static public void main(String[] args) throws SalaryException, YearException, PageNumberException {
        Manual manual = new Manual(
                "���������� ����������",
                "��������� ������� �������������",
                2001,
                233,
                500
        );
        Textbook textbook = new Textbook(
                "�������� �������. ������� ������ �������.",
                "����� ������ ���������� , �������� �������� �������������",
                2013,
                165,
                350
        );
        Encyclopedia encyclopedia = new Encyclopedia(
                "��� � �������� � ���������� ���������",
                "����� �������",
                2005,
                321,
                645
        );
        System.out.printf(manual.toString());
        System.out.printf(textbook.toString());
        System.out.printf(encyclopedia.toString());
    }

}
