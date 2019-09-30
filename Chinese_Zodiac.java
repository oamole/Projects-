class Chinese_Zodiac{
 private  String First_Name;
  private String Last_Name;
  private int YearOfBirth;
  private int n;//difference in number of years between year inputed and 1900
  public Chinese_Zodiac( )
  {
    First_Name = "Seun";
	Last_Name = "Amole";
	YearOfBirth = 1900;
  }
  public Chinese_Zodiac(String NewFirst_Name,String NewLast_Name,int NewYearOfBirth){
	  First_Name = NewFirst_Name;
	  Last_Name = NewLast_Name;
	  YearOfBirth = NewYearOfBirth;
  }
  String getFirst_Name(){
	  return First_Name;
  }
  String getLast_Name(){
	  return Last_Name;
  }
  int getYearofBirth(){
	  return YearOfBirth;
  }
  public void setFirst_Name(String First_Name){
	  this.First_Name = First_Name;
  }
  public void setLast_Name(String Last_Name){
	  this.Last_Name = Last_Name;
  }
  public void setYearOfBirth(int YearOfBirth){
	  this.YearOfBirth = YearOfBirth;
  }
  public String animalYear(){
	  System.out.println("Year of the");
	  switch(YearOfBirth){
		  case 1900:
		  System.out.println("Rat");
		  break;
		  case 1901:
		  System.out.println("Ox");
		  break;
		  case 1902:
		  System.out.println("Tiger");
		  break;
		  case 1903:
		  System.out.println("Rabbit");
		  break;
		  case 1904:
		  System.out.println("Dragon");
		  break;
		  case 1905:
		  System.out.println("Snake");
		  break;
		  case 1906:
		  System.out.println("Horse");
		  break;
		  case 1907:
		  System.out.println("Ram");
		  break;
		  case 1908:
		  System.out.println("Monkey");
		  break;
		  case 1909:
		  System.out.println("Rooster");
		  break;
		  case 1910:
		  System.out.println("Dog");
		  break;
		  case 1911:
		  System.out.println("Boar");
		  break;
		 
		  
	  default:
	  System.out.println("Enter an actual Year");
	  break;
	  
	  }
	 return First_Name;
	  
	  
  }
  public String toString(){
	  String msg = "The First Name is: "    +First_Name       +"The Last Name is: "               +Last_Name                   +"The Year of Birth is:"                       +YearOfBirth;
return msg;	  
}
}
	  