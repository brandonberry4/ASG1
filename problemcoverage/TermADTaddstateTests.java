import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTaddstateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <t>.add() -> <t>
	 */
	@Test
	public void addT() {
		TermADT o = TermADTStates.state9();
		// TODO Error, could not find method add
		fail("Error reading Problem Instance");
	}
}
