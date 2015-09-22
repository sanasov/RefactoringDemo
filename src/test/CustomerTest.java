package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.scrumtrek.simplestore.*;


public class CustomerTest {

	@Before
	public void setUp() throws Exception {
		Movie movCinderella = new Movie("Cinderella", PriceCodes.Childrens);
		Movie movStarWars = new Movie("Star Wars", PriceCodes.Regular);
		Movie movGladiator = new Movie("Gladiator", PriceCodes.NewRelease);

		// Create customers
		Customer custMickeyMouse = new Customer("Mickey Mouse");
		Customer custDonaldDuck = new Customer("Donald Duck");
		Customer custMinnieMouse = new Customer("Minnie Mouse");

		// Create rentals
		Rental rental1 = new Rental(movCinderella, 0);
		Rental rental2 = new Rental(movStarWars, 0);
		Rental rental3 = new Rental(movGladiator, 0);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void WhenRentalIsNullstest() {
		
		
	}

}
