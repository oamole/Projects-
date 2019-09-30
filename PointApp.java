class PointApp{
	public static void main (String [] args){
		Point p1= new Point(2,3);
		System.out.println(p1.toString());
		p1.move(1,-1);
		System.out.println(p1.toString());
		float dist;
		dist = p1.distance();
		System.out.println("Distance=" +dist);
		
	}
}