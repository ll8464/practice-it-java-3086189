package _02_04;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.

  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.


  //Setters
  public void setDestination(String newDestination){
    this.destination = newDestination;
  }

  public void setPrice(double newPrice){
    this.price = newPrice;
  }

  public void setIsReturn(boolean newIsReturn){
    this.isReturn = newIsReturn;
  }

  //Getters
  public String getDestination(){
    return destination;
  }

  public double getPString(){
    return price;
  }

  public boolean isReturn(){
    return isReturn;
  }

}
