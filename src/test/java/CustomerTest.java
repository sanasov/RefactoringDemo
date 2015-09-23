
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.scrumtrek.simplestore.*;

import static org.mockito.Mockito.*;
import  org.fest.assertions.*;


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

/*	@Test(timeout = 1000)
	public void Maintest() {
		String statement = who.Statement();
		//assertEquals(expected, actual);
		System.out.println(statement);
	}*/
	
	
/*	@Test(timeout = 2000)
	public void ShouldResultNotNullWhenRentalIsNullstest() {
		Customer who = new Customer("Who");
		// Create rentals
		Rental rental1 = null;
		String resultActual = who.Statement();
		resultExpected = "Rental record for " + m_Name + "\n";
		assertEquals(resultExpected, resultActual);
		thrown.expect(NullPointerException.class);
	}*/

/*	@Test(timeout = 2000)
	public void ShouldResultNotNullWhenRentalDaysIsNullstest() {
		Customer who = new Customer("Who");
		// Create rentals
		Rental rental1 = new Rental(movCinderella, 0);
		String resultActual = who.Statement();
		String resultExpected = "Rental record for " + m_Name + "\n";
		assertEquals(resultExpected, resultActual);
	}*/
	
	@Test//(timeout = 20000)
	public void statementTest() {
		Customer sut = new Customer("Sut");
		//Movie mockMov = mock(Movie.class);
		Movie movStarWars = new Movie("Star Wars", PriceCodes.Regular);
		Rental rental1 = new Rental(movStarWars, 1);
		sut.addRental(rental1);
		//when
		//when(sut.Statement()).thenReturn("first");
		String result = sut.Statement();
		Assertions.assertThat(result).isNotEmpty()
									 .contains("Rental record for " + sut.getName() + "\n");
		
	}
	
	public void MockObjTest() {
		Customer sut = new Customer("Sut");
		Movie mockMov = mock(Movie.class);
		//Movie movStarWars = new Movie("Star Wars", PriceCodes.Regular);
		when(mockMov.getTitle()).thenReturn("Star Wars");
		when(mockMov.getPriceCode()).thenReturn(PriceCodes.Regular);
		
		Rental rental1 = new Rental(mockMov, 1);
		
		sut.addRental(rental1);
		//when
		//when(sut.Statement()).thenReturn("first");
		String result = sut.Statement();
		Assertions.assertThat(result).isNotEmpty()
									 .contains("Rental record for " + sut.getName() + "\n");
		
	}

}
