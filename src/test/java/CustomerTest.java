
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.scrumtrek.simplestore.*;

import  org.fest.assertions.*;


public class CustomerTest {
private Customer sut;
	@Before
	public void setUp() throws Exception {
		 sut = new Customer("Sut");
	}

	


	
	@Test(timeout = 2000)
	public void statementTest() {
		Movie movStarWars = new Movie("Star Wars", PriceCodes.Regular);
		Rental rental1 = new Rental(movStarWars, 1);
		sut.addRental(rental1);
		String result = sut.Statement();
		Assertions.assertThat(result).isNotEmpty()
									 .contains("Rental record for " + sut.getName() + "\n");
		
	}
	
	@Test
	public void shouldResultIsNotNullWhenMovieHasEmptyFields() {

		String result = sut.Statement();
		Assertions.assertThat(result).isNotEmpty()
									 .contains("Rental record for " + sut.getName() + "\n");

		
	}

	
}
