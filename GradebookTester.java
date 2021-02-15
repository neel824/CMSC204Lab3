import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
GradeBook g1;
GradeBook g2;
	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(90);
		g1.addScore(95);
		g2.addScore(99);
		g2.addScore(99);
		g2.addScore(99);
		
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("90.0 95.0 "));
		assertTrue(g2.toString().equals("99.0 99.0 99.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(185, g1.sum(), .0001);
		assertEquals(297, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(90, g1.minimum(), .001);
		assertEquals(99, g2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(2, g1.getScoreSize(), .001);
		assertEquals(3, g2.getScoreSize(), .001);
	}
}