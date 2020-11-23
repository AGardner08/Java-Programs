import java.awt.*;

public class PointTest {
    
    public static void main(String[] args) {
        byte x = 1;
        byte y = 2; 
        x = 2;
        
        System.out.println("Byte x: " + x);
        System.out.println("Byte y: " + y);
        
        Point point1 = new Point(1,3);
        Point point2 = point1;
        
        point1.x = 2;
        
        System.out.println(point1);
        System.out.println(point2);        
        
    }
}
