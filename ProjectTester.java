package se_02;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProjectTester {

	Project seq = new Project(new String[][] { { "A", "B" }, { "C", "D" }, { "B", "C" } });
	
	@Test
	public void testOverflow3() {
		assertTrue(seq.isWellSorted(new String[]{"A", "B", "C", "D"}));
		assertFalse(seq.isWellSorted(new String[]{"D", "C", "B", "A"}));
	}
}
