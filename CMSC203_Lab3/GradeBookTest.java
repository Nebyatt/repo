import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gradebook1;
	private GradeBook gradebook2;

	@BeforeEach
	public void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		// adding scores
		gradebook1.addScore(80);
		gradebook1.addScore(90);
		
		// adding scores
		
		gradebook2.addScore(75);
		gradebook2.addScore(85);
		gradebook2.addScore(95);
	}

	@AfterEach
	public void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	public void testAddScore() 
	{
		assertEquals("80.0 90.0", gradebook1.toString());
	    assertEquals(2, gradebook1.getScoreSize());
	    assertTrue(gradebook1.addScore(85));
	    assertEquals("80.0 90.0 85.0", gradebook1.toString());
	    assertEquals(3, gradebook1.getScoreSize());
	    assertTrue(gradebook1.addScore(95)); // Gradebook already full
	}

	@Test
	public void testSum() 
	{
		assertEquals(170.0, gradebook1.sum(), 0.01); // 80 + 90 = 170
	    assertEquals(255.0, gradebook2.sum(), 0.01); // 75 + 85 + 95 = 255
	}

	@Test
	public void testMinimum() 
	{
		assertEquals(80.0, gradebook1.minimum(), 0.01); // Minimum score in gradebook1
	    assertEquals(75.0, gradebook2.minimum(), 0.01); // Minimum score in gradebook2
	}

	@Test
	public void testFinalScore() 
	{
		assertEquals(90.0, gradebook1.finalScore(), 0.01); // Final score of gradebook1
	    assertEquals(180.0, gradebook2.finalScore(), 0.01); // Final score of gradebook2
	}

}
