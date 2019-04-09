
package shape;


public class circle {

 final float PI = (float) 3.14;
  private int r;
 private float area;

    public circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
    
    public void Area()
    {
     area= r*r*PI;
     System.out.println("Area of Circle = "+ area);
    }

     }
