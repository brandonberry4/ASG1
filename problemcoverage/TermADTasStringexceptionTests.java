import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTasStringexceptionTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <>.isEmpty() == true
	 */
	@Test
	public void emptyString() {
		TermADT o = TermADTStates.state0();
		// TODO Error, could not find method isEmpty
		fail("Error reading Problem Instance");
	}
}
