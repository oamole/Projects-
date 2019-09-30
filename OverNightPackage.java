public class OverNightPackage extends Package{

  public OverNightPackage(String fromA, String toA, float weight){
    super(fromA, toA, weight);
  }

  public float CalculateCharge(){
    float charge = super.CalculateCharge() + twoDayExtraCharge * this.getWeight();

    return charge;
  }


  public String printReceipt(){
    String str = "";
    str += "Reciept for Package ID: " + this.getPackageID() + "\n";
    str += "Type: Overnight" + "\n";
    str += "From Address: " +this.getFromAddress()+"\n";
    str += "To Address: " + this.getToAddress() + "\n";
    str += "Weight: "+this.getWeight() + " oz.\n";
    str += "Charge: $"+this.CalculateCharge() + "\n";

    return str;
  }

}
