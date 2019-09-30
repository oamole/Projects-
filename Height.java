class Height{
public static void main (String[] args){
	int [] ht = new int [5];
	ht[0] = 60;
	ht[1] = 62;
	ht[2] = 65;
	ht[3] = 56;
	ht[4] = 60;
float avg = (float)(ht[0] + ht[1] + ht[2] + ht[3] + ht[4])/(float)5;
System.out.println("Your Average Height= " +avg);
//int max = ht[0];
//int max_index = 0;
int min = ht [0];
int min_index =  0;
for(int i = 1; i<5; ++i){
	System.out.println("Value at index:" +i + " = " +ht[i]);
	//if (ht[i] > max){
		//max = ht[i];
	   // max_index = i;
	//}
   if (ht[i] < min){
		min = ht[i];
		min_index = i;
	}
	//System.out.println("Your Maximum Height is " + max + "at" + max_index);
	System.out.println("Your minimum Height is " + min + "at" +min_index);

}

}

}