import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTsetexceptionTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <4x5>.set(0) !! IllegalArgumentException
	 */
	@Test
	public void negCoef() throws IllegalArgumentException {
		TermADT o = TermADTStates.state1();
		// TODO Error, could not find method set
		fail("Error reading Problem Instance");
	}

	/**
	 * <4x5>.set(0) !! IllegalArgumentException
	 */
	@Test
	public void negPow() throws IllegalArgumentException {
		TermADT o = TermADTStates.state1();
		// TODO Error, could not find method set
		fail("Error reading Problem Instance");
	}
}
