import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

/**
 *
 * @author Mj 2
 */
public class ArrayMaxCheckTest extends TestCase{
    
    public ArrayMaxCheckTest(String name) {
        super(name);        
    }
    
    ArrayMaxCheck max = new ArrayMaxCheck();
   
    @Before
    @Override
    public void setUp() {
        System.out.println("Before Test Started");
    }
    
    @After
    @Override
    public void tearDown() {
        System.out.println("After Test Started");
    }
    
    @Test
    public void testCheckMax() throws NumberFormatException,IOException
    {
        assertEquals(4,max.checkMax(max.inputArr()));
    }
    
}
