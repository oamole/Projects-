public abstract class GeometricFigure {
   private double height;
   private double width;
   private double area;

   public GeometricFigure()
   {
      this.height = 0;
      this.width  = 0;
      //this.area=0;
   }

   public GeometricFigure(double h, double w)
   {
      this.height = h;
      this.width  = w;
      //this.area=a;
   }

   public double getHeight()
   {
      return this.height;
   }

   public double getWidth()
   {
      return this.width;
   }

   public double getArea()
   {
      return this.area;
   }

   public void setHeight(double ht)
   {
      this.height = ht;
   }

   public void setWidth(double wt)
   {
      this.width = wt;
   }

   public void setArea(double ar)
   {
      this.area = ar;
   }

   public String toString()
   {
      String str = "Height: " + this.getHeight() + "\n" + "Width: " + this.getWidth();

      return str;
   }

   public abstract double area();
}
