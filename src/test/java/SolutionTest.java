import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.bird.Bird;


public class SolutionTest {
	@Test
	public void testBird(){
		Bird bird=new Bird();
		
		assertEquals("I am Singing",bird.sing());
	}
}
