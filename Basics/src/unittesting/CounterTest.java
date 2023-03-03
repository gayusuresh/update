package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class CounterTest extends TestCase
{
	
	public CounterTest() 
	{ 
		
		
	} 
	protected void setUp()
	{ // creates a (simple) test fixture
		//counter1 = new Counter();
		}
	@Test
	  public void testIncrement() {
		assertTrue(Counter.increment() == 1);
		//assertTrue(Counter.increment() == 2);
		}
	@Test
		public void testDecrement() {
			assertTrue(Counter.decrment() == -1);
			//assertTrue(Counter.increment() == -2);
			}

	

}
