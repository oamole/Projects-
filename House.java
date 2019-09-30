public class House{
  private int NumberOfBedrooms;
  private int PriceOfHouse;
  private int SquareFootageOfHouse;

  public House(){
    NumberOfBedrooms = 0;
    PriceOfHouse = 10;
    SquareFootageOfHouse = 15;
  }

  public House(int newNumberOfBedrooms, int newPriceOfHouse, int newSquareFootageOfHouse){
    NumberOfBedrooms = newNumberOfBedrooms;
    PriceOfHouse = newPriceOfHouse;
    SquareFootageOfHouse = newSquareFootageOfHouse;
  }

  int getNumberOfBedrooms(){
    return NumberOfBedrooms;
  }
  int getPriceOfHouse(){
    return PriceOfHouse;
  }
  int getSquareFootageOfHouse(){
    return SquareFootageOfHouse;
  }
  public void setNumberOfBedrooms(int NumberOfBedrooms){
  			this.NumberOfBedrooms=NumberOfBedrooms;
  		}
  public void setPriceOfHouse(int PriceOfHouse){
      this.PriceOfHouse=PriceOfHouse;
      }
  public void setSquareFootageOfHouse(int SquareFootageOfHouse){
      this.SquareFootageOfHouse=SquareFootageOfHouse;
  }
  public String toString(){
    String msg = "The Number of Bedrooms is:"      +NumberOfBedrooms           +"The Price of House is:"      +PriceOfHouse   +"The Square Footage of the House is:"                 +SquareFootageOfHouse;
    return msg;
  }
}
