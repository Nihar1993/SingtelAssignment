import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.bird.Bird;
import com.singtel.bird.Chicken;
import com.singtel.bird.Duck;


public class SolutionTest {
	@Test
	public void testBird(){
    Chicken chk=new Chicken();
		

		Duck dck =new Duck();
		
		assertEquals("Quack,quack",dck.sing());
		assertEquals("Cluck,Cluck",chk.sing());
		assertFalse(chk.isAbleToFly());
		assertFalse(chk.isAbleToSwim());
		//assertEquals("Cluck,Cluck",dck.s);
		
	}
}
