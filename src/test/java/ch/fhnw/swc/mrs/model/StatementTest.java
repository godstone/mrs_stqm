package ch.fhnw.swc.mrs.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StatementTest {
    
    private Statement s;
    private List<Rental> rentals;

    // TODO: write this

    private static final class TestStatement extends Statement {
        public TestStatement(String name, String firstName, List<Rental> rentals) {
            super(name, firstName, rentals);
        }

        @Override
        public String print() { return ""; }
    }

    @Before
    public void setup() {
        Rental r1 = mock(Rental.class);
        Rental r2 = mock(Rental.class);
        Rental r3 = mock(Rental.class);

        rentals = new ArrayList<>(3);
        rentals.add(r1);
        rentals.add(r2);
        rentals.add(r3);
    }

    @Test
    public void testStatement() {
        s = mock(Statement.class);
        when(s.getLastName()).thenReturn("Muster");
        when(s.getFirstName()).thenReturn("Hans");
        when(s.getRentals()).thenReturn(rentals);

        assertEquals("Muster", s.getLastName());
        assertEquals("Hans", s.getFirstName());
        assertEquals(3, s.getRentals().size());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFirstName() {
        throw new IllegalArgumentException();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testLastName() {
        throw new IllegalArgumentException();
    }

    @Test(expected=IllegalArgumentException.class)
    public void testRentals() {
        throw new IllegalArgumentException();
    }


}
