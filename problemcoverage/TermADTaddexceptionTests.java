import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTaddexceptionTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <t>.equals(t) !! IllegalArgumentException
	 */
	@Test
	public void checkT() throws IllegalArgumentException {
		TermADT o = TermADTStates.state9();
		// TODO Error, could not find method equals
		fail("Error reading Problem Instance");
	}
}
