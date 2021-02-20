import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTasStringstateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <4x5>.set() -> <newCoef x newPow>
	 */
	@Test
	public void setString() {
		TermADT o = TermADTStates.state1();
		// TODO Error, could not find method set
		fail("Error reading Problem Instance");
	}
}
