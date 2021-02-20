import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTgetCoefexceptionTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <4x5>.get(1) !! IllegalArgumentException
	 */
	@Test
	public void notCoef() throws IllegalArgumentException {
		TermADT o = TermADTStates.state1();
		// TODO Error, could not find method get
		fail("Error reading Problem Instance");
	}
}
