import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.PriceCodes;
import com.scrumtrek.simplestore.Rental;

import static org.mockito.Mockito.*;




public class RentalBuilder {
	int dr;
	String m_title;
	PriceCodes priceCode;
	
		public RentalBuilder withDaysRented(int dr) {
			this.dr=dr;
			return this;
		}
		public RentalBuilder withMovieTitle(String title) {
			this.m_title = title;
			return this;
		}
		
		public RentalBuilder withPriceCode(PriceCodes priceCode) {
			this.priceCode = priceCode;
			return this;
		}
		
		public Rental build() {
			Movie mockMov = mock(Movie.class);
			Rental r = mock(Rental.class);
			when(mockMov.getTitle()).thenReturn(m_title);
			when(mockMov.getPriceCode()).thenReturn(priceCode);
			when(r.getDaysRented()).thenReturn(dr);
			when(r.getMovie()).thenReturn(mockMov);		
			return r;
		}
}
