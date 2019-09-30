public class Circle{
    private double radius;

    public Circle(){
        this.setRadius(0);
    }
    public Circle(double r){
        this.setRadius(r);
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2.0);
    }
    public double getCircumference(){
        return Math.PI * (this.radius * 2);
    }
    public void setRadius(double r){
        this.radius = r;
    }

    public String toString(){
        String str = "Radius: " + this.getRadius() + "\n";
        str += "Circumference: " + this.getCircumference() + "\n";
        str += "Area: " + this.getArea() + "\n";
        return str;
    }

}
