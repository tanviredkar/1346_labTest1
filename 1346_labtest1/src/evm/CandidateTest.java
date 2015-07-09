package evm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {
    Candidate c=new Candidate();
	@Test
	public void testCandidate() {
		assertEquals(0,c.getNumber());
	}

}
