public class AreaCalculator {

    //return double = Area of a circle
    public static double area (double radius) {

        if(radius < 0 ) {
            return -1.0;
        }

        //Use math class for PI
        radius = radius * radius * Math.PI;
        return radius;

    }

    //Represent the area of a rectangle
    public static double area (double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        double Area = x * y;
        return Area;

    }

}
