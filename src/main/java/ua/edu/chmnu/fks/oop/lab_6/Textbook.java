package ua.edu.chmnu.fks.oop.lab_6;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

public class Textbook extends Book {

    private String bookType = "�������";

    public Textbook() {

    }

    public Textbook(String name, String author, int year, int pageNumber, int price) throws SalaryException, YearException, PageNumberException {
        super(name, author, year, pageNumber, price);
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return '\n' + "��� �����: " + bookType + '\n'
                + "���: " + getName() + '\n'
                + "�����: " + getAuthor() + '\n'
                + "���: " + getYear() + '\n'
                + "���-�� �������: " + getPageNumber() + '\n'
                + "����: " + getPrice() + '\n';
    }
}
