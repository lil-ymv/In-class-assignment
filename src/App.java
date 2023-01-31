import Cylinderclass.Cylinder;
import circleclass.circle;

public class App {
    public static void main(String[] args) throws Exception {

        circle circle1 = new circle(10, 20);

        System.out.println("Area of circle: " + circle1.getArea());

        System.out.println("Parameter of circle: " + circle1.getParameter());
    
        Cylinder cylinder1 = new Cylinder(10, 20);

        System.out.println("Cylinder Volume: " + cylinder1.getVolume());
    }
}
