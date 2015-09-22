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
		Customer who = new Customer("Who");

		// Create rentals
		Rental rental1 = new Rental(movCinderella, 0);
		Rental rental2 = new Rental(movStarWars, 3);
		Rental rental3 = new Rental(movGladiator, 4);
		
		who.addRental(rental1);
		who.addRental(rental2);
		who.addRental(rental3);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 1000)
	public void Maintest() {
		String statement = who.Statement();
		assertEquals(expected, actual);
		System.out.println(statement);
	}
	
	
	@Test(timeout = 2000)
	public void ResultNotNullWhenRentalIsNullstest() {
		Customer who = new Customer("Who");
		// Create rentals
		Rental rental1 = null;
		String resultActual = who.Statement();
		resultExpected = "Rental record for " + m_Name + "\n";
		assertEquals(resultExpected, resultActual);
		thrown.expect(NullPointerException.class);
	}

	@Test(timeout = 2000)
	public void ResultNotNullWhenRentalDaysIsNullstest() {
		Customer who = new Customer("Who");
		// Create rentals
		Rental rental1 = new Rental(movCinderella, 0);
		String resultActual = who.Statement();
		resultExpected = "Rental record for " + m_Name + "\n";
		assertEquals(resultExpected, resultActual);
	}

}
