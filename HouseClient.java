public class HouseClient{
  public static void main (String [] args){
    House house1 = new House();
    House house2 = new House(50,8000,90);
    int bn = house1.getNumberOfBedrooms();
    int pn = house1.getPriceOfHouse();
    int fn = house1.getSquareFootageOfHouse();
    int bn_2 = house2.getNumberOfBedrooms();
    int pn_2 = house2.getPriceOfHouse();
    int fn_2 = house2.getSquareFootageOfHouse();
    System.out.println("The number of bedrooms in House house1 is:" +bn);
      System.out.println("The Price of House house1 is:" +pn);
        System.out.println("The Square Footage Of House house1 is:" +fn);
        System.out.println("The number of bedrooms in House house2 is:" +bn_2);
          System.out.println("The Price of House house2 is:" +pn_2);
            System.out.println("The Square Footage Of House house2 is:" +fn_2);

        String output=house1.toString();
         System.out.println(output);
         String output1=house2.toString();
System.out.println(output1);




  }
}
