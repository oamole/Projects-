

public abstract class Package implements ChargeConstants{
    private String fromAddress;
    private String toAddress;
    private float weight;
    private int packageID;
    private static int idCounter = 1000;

    public Package(String fromA, String toA, float weight){
        this.setFromAddress(fromA);
        this.setToAddress(toA);
        this.setWeight(weight);
        this.packageID = this.idCounter++;

    }

    // Accessors
    public int getPackageID(){
      return this.packageID;
    }
    public String getFromAddress(){
      return this.fromAddress;
    }
    public String getToAddress(){
      return this.toAddress;
    }
    public float getWeight(){
      return this.weight;
    }

    // Mutators
    public void setPackageID(int id){
        this.packageID = id;
    }
    public void setFromAddress(String fromA){
      this.fromAddress = fromA;
    }
    public void setToAddress(String toA){
      this.toAddress = toA;
    }

    public void setWeight(float weight){
      this.weight = weight;
    }

    // Helper Methods
    public float CalculateCharge(){
      float charge = baseCharge * this.getWeight();
      return charge;
    }

    public abstract String printReceipt();

  }
