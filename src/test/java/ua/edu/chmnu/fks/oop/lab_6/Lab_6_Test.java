package ua.edu.chmnu.fks.oop.lab_6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author User
 */
public class Lab_6_Test {

    @Test
    public void getWorkerTypeTest(){
        Director director = new Director();
        assertEquals("Director", director.getWorkerType());
    }

    @Test
    public void getNameTest(){
        Director director = mock(Director.class);
        when(director.getName()).thenReturn("Rick Danial Riordan");
        assertEquals("Rick Danial Riordan", director.getName());
    }

    @Test
    public void getYearTest(){
        Director director = mock(Director.class);
        when(director.getYear()).thenReturn(2001);
        assertEquals(2001, director.getYear());
    }

    @Test
    public void getYearsNumberTest(){
        Director director = mock(Director.class);
        when(director.getYearsNumber()).thenReturn(233);
        assertEquals(233, director.getYearsNumber());
    }

    @Test
    public void getSalaryTest(){
        Director director = mock(Director.class);
        when(director.getSalary()).thenReturn(500);
        assertEquals(500, director.getSalary());
    }

    @Test
    public void setNameTest(){
        Director director = mock(Director.class);
        director.setName("Tom");
        director.setName("Bill");
        director.setName("Bill");
        director.setName("Bill");
        director.setName("John");

        verify(director, times(1)).setName("Tom");
        verify(director, times(3)).setName("Bill");
        verify(director, times(1)).setName("John");

        InOrder inOrder = inOrder(director);
        inOrder.verify(director).setName("Tom");
        inOrder.verify(director, times(3)).setName("Bill");
        inOrder.verify(director).setName("John");

    }

    @Test
    public void setYearTest() throws YearException {
        Director director = mock(Director.class);
        director.setYear(2000);
        director.setYear(2004);
        director.setYear(2004);
        director.setYear(2004);
        director.setYear(2010);

        verify(director, times(1)).setYear(2000);
        verify(director, times(3)).setYear(2004);
        verify(director, times(1)).setYear(2010);

        InOrder inOrder = inOrder(director);
        inOrder.verify(director).setYear(2000);
        inOrder.verify(director, times(3)).setYear(2004);
        inOrder.verify(director).setYear(2010);

        doThrow(NegativeYearException.class).when(director).setYear(-2000);
        doThrow(FutureYearException.class).when(director).setYear(2020);
    }

    @Test
    public void setYearsNumberTest() throws YearsNumberException {
        Director director = mock(Director.class);
        director.setYearsNumber(250);
        director.setYearsNumber(300);
        director.setYearsNumber(300);
        director.setYearsNumber(300);
        director.setYearsNumber(425);

        verify(director, times(1)).setYearsNumber(250);
        verify(director, times(3)).setYearsNumber(300);
        verify(director, times(1)).setYearsNumber(425);

        InOrder inOrder = inOrder(director);
        inOrder.verify(director).setYearsNumber(250);
        inOrder.verify(director, times(3)).setYearsNumber(300);
        inOrder.verify(director).setYearsNumber(425);

        doThrow(NegativeYearsNumberException.class).when(director).setYearsNumber(-223);
        doThrow(EnormousYearsNumberException.class).when(director).setYearsNumber(24000);
    }

    @Test
    public void setSalaryTest() throws SalaryException {
        Director director = mock(Director.class);
        director.setSalary(300);
        director.setSalary(500);
        director.setSalary(500);
        director.setSalary(500);
        director.setSalary(225);

        verify(director, times(1)).setSalary(300);
        verify(director, times(3)).setSalary(500);
        verify(director, times(1)).setSalary(225);

        InOrder inOrder = inOrder(director);
        inOrder.verify(director).setSalary(300);
        inOrder.verify(director, times(3)).setSalary(500);
        inOrder.verify(director).setSalary(225);

        doThrow(NegativeSalaryException.class).when(director).setSalary(-500);
        doThrow(EnormousSalaryException.class).when(director).setSalary(1000000000);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
