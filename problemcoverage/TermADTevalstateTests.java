import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTevalstateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <x>.insert() -> <x>
	 */
	@Test
	public void evaluate() {
		TermADT o = TermADTStates.state4();
		// TODO Error, could not find method insert
		fail("Error reading Problem Instance");
	}
}
