package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	public void findMax()
	{
		 assertEquals(9,Calculation.maxNum(new int[]{4,3,4,2}));  
	     assertEquals(-1,Calculation.maxNum(new int[]{-1,-12,-3,-4,-2})); 
		
	}


}
