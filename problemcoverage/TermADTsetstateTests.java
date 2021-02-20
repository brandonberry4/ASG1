import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TermADTsetstateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <c,p>.set(0) -> <c>
	 */
	@Test
	public void setCoef() {
		TermADT o = TermADTStates.state6();
		// TODO Error, could not find method set
		fail("Error reading Problem Instance");
	}

	/**
	 * <c,p>.set(1) -> <p>
	 */
	@Test
	public void setPow() {
		TermADT o = TermADTStates.state6();
		// TODO Error, could not find method set
		fail("Error reading Problem Instance");
	}
}
