import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class MainApplicationTest 
{


		
	   //@InjectMocks annotation is used to create and inject the mock object
	   @InjectMocks 
	   MainApplication mathApplication = new MainApplication();

	   //@Mock annotation is used to create the mock object to be injected
	   @Mock
	   CalculatorService calcService;

	   @Test
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	    when(calcService.add(10.00,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	   }


}
