import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.scrumtrek.simplestore.Customer;
import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.PriceCodes;
import com.scrumtrek.simplestore.Rental;


public class RentalTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Customer custMickeyMouse = new Customer("Mickey Mouse");
		Rental mockRental = new RentalBuilder().withMovieTitle("Star Wars").withPriceCode(PriceCodes.Childrens).withDaysRented(2).build();
		Movie movCinderella = new Movie("Cinderella", PriceCodes.Childrens);
		Rental rental1 = new Rental(movCinderella, 2);
		assertEquals(mockRental.getDaysRented(),rental1.getDaysRented());
		
	}

}
