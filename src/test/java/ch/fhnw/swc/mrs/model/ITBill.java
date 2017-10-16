package ch.fhnw.swc.mrs.model;

import ch.fhnw.swc.mrs.data.DbMRSServices;
import ch.fhnw.swc.mrs.model.Movie;
import ch.fhnw.swc.mrs.model.PriceCategory;
import ch.fhnw.swc.mrs.model.Rental;
import ch.fhnw.swc.mrs.model.User;
import ch.fhnw.swc.mrs.model.Bill;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ITBill {

    private User user1;
    private User user2;

    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    @Before
    public void setup() {
        user1 = new User("Muster", "Hans", LocalDate.of(1961, 12, 13));
        user2 = new User("Müller", "Klara-Johanna-Gabriela-Alfreda", LocalDate.of(1950, 3, 4));


        movie1 = new Movie("IT", LocalDate.of(2017, 8, 8), RegularPriceCategory.getInstance(), 18);
        movie2 = new Movie("ET", LocalDate.of(1990, 2, 4), RegularPriceCategory.getInstance(), 10);
        movie3 = new Movie("2012", LocalDate.of(2010, 5, 7), RegularPriceCategory.getInstance(), 16);
    }

    @Test
    public void testShortName() {
        DbMRSServices dbservice = new DbMRSServices();
        dbservice.init();
        dbservice.createRental(user1, movie1);
        dbservice.createRental(user1, movie2);
    }

    @Test
    public void testLongName() {
        DbMRSServices dbservice = new DbMRSServices();
        dbservice.init();
        dbservice.createRental(user2, movie2);
        dbservice.createRental(user2, movie3);
    }


}
