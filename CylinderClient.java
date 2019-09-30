public class CylinderClient{
    public static void main(String[] args) {
        Circle circle1 = new Circle(7.0);
        Cylinder cylinder1 = new Cylinder(5.0, 6f);
        Cylinder cylinder2 = new Cylinder(circle1, 3.0f);

        System.out.println("Circle One ");
        System.out.println(circle1.toString() + "\n");
        System.out.println("Cylinder One");
        System.out.println(cylinder1.toString() + "\n");
        System.out.println("Cylinder Two");
        System.out.println(cylinder2.toString());

        

    }
}
