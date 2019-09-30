public class Cylinder extends Circle{
    private float height;

    public Cylinder(){
        super();
        this.setHeight(0);
    }
    public Cylinder(double r, float h){
        super(r);
        this.setHeight(h);
    }
    public Cylinder(Circle c, float h){
        super(c.getRadius());
        this.setHeight(h);
    }

    // Accessors
    public float getHeight(){
        return this.height;
    }
    public float getVolume(){
        return this.height * (float)this.getArea();
    }

    public void setHeight(float h){
        this.height = h;
    }

    public String toString(){
        String str = super.toString();
        str += "Height: "+ this.getHeight() + "\n";
        str += "Volume: " + this.getVolume() + "\n";

        return str;
    }

}
