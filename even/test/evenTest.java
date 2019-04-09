import java.io.IOException;

import junit.framework.TestCase;


public class evenTest extends TestCase {
    even e2=new even();
    
    public evenTest(String name) {
            super(name);
    }
    
    public void testSum() throws IOException {
    	
            assertEquals(0,e2.ee());
            //System.out.println(e2.nn());
           
   }


}
