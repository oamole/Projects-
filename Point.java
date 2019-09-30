class Point{
private float x;
private float y ;
Point(){
	x=1;
	y=1;
}
Point(float tmp_x,float tmp_y){
	x= tmp_x;
	y= tmp_y;
}
public float Getx(){
	return x;
}
public float gety(){
	return y;
}
public void setx(float tmp_x){
	this.x= tmp_x;
}
public void sety(float tmp_y){
	y=tmp_y;
}
public void move(float delta_x,float delta_y){
	x=x+delta_x;
	y=y+delta_y;
}
public float  distance(){
	float x_square = (float)Math.pow(x-0,2);
	float y_square = (float)Math.pow(y-0,2);
	float dist = (float)Math.sqrt(x_square+y_square);
	return dist;


}
public String toString(){
	String msg = "X-coordinate: " +x   +  "   Y-coordinate: " +y;
 return msg;
}
public String getquadrant(){
	String msg;
	msg = "mr";
	if(x==0 && y==0){
		msg="Origin";
	}
	if (x>=0 && y>=0)
	{
		msg= "First Quadrant";
	}
	if (x<=0 && y>=0)
	{
        msg="Second Quadrant";
	}
	if (x<0 && y<0)
	{
		msg= "Third Quadrant";
	}
	if (x>0 && y<0)
	{
		msg = "Fourth Quadrant";
	}
	return msg;
}
}
int j=0; j<OutputPerLine ; j++
int i = InitialValue; i<=UpperLimit; i+=Increment
