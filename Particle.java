import java.text.*;
public class Particle {
	//instance variables
	private double a, b, c, d;
private static final DecimalFormat THREE_FORMAT = new DecimalFormat("##0.000");


	//non-default constructor
	public Particle(double newA, double newB, double newC, double newD) {
		setA(newA);
		setB(newB);
		setC(newC);
		setD(newD);
	}

	//accessor methods
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	//mutator methods
	public void setA(double newA) {
		a=newA;
	}

	public void setB(double newB) {
		b=newB;
	}

	public void setC(double newC) {
		c=newC;
	}

	public void setD(double newD) {
		d=newD;
	}

	public void table(double start, double end, double increment) {
	// add your code here
	double location;
	double velocity;

for(double i = start; i<end; i+=increment){
	location =a * Math.pow(i,4) +   b*  Math.pow(i,3)  +c* Math.pow(i,2)+ d*i;
  velocity =4*a* Math.pow(i,3) + 3*b* Math.pow(i,2) + 2*c*i;
		System.out.println("location:" +Particle.THREE_FORMAT.format(location));
		System.out.println("velocity:" +Particle.THREE_FORMAT.format(velocity));
		System.out.println("Time:" +Particle.THREE_FORMAT.format(i));
if(location-location>1){
	System.out.println("More than one unit distance");
}
else{
	System.out.println("Continue");
}
	}


	}

	public String toString() {
		return "location(t) = " +a+"t^4+"+b+"t^3+"+c+"t^2+"+d+"t";
	}


}
