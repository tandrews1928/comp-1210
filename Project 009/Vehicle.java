import java.text.DecimalFormat;
/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/

public abstract class Vehicle {
   protected String owner;
   protected double value;
   protected boolean altfuel;
   protected String yearmakemodel;
   private static int vehiclecount = 0;
   /**
   *constructs everything.
   *@param ownerIn = the owner.
   *@param yearmakemodelIn = the year make and model.
   *@param valueIn = the value.
   *@param altfuelIn = alternate fuel
   */ 
   public Vehicle(String ownerIn, String yearmakemodelIn, double valueIn,
       boolean altfuelIn) {
      owner = ownerIn;
      value = valueIn;
      altfuel = altfuelIn;
      yearmakemodel = yearmakemodelIn;
      vehiclecount++;
   }
  /**
  *get owner method.
  *@return owner = the owner.
  */
   public String getOwner() {
      return owner;
   }
  /**
  *set owner method.
  *@param ownerIn = the owner.
  */ 
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
  /**
  *get yearmakemodel method.
  *@return yearmakemode = the yearmakeandmodel.
  */ 
   public String getYearMakeModel() {
      return yearmakemodel;
   }
   /**
  *set yearmakemodel method.
  *@param yearmakemodelIn = the yearmakeandmodel.
  */ 
   public void setYearMakeModel(String yearmakemodelIn) {
      yearmakemodel = yearmakemodelIn;
   }
   /**
  *get value method.
  *@return value = the value.
  */ 
   public double getValue() {
      return value;
   }
  /**
  *get value method.
  *@param valueIn = the value1.
  */  
   public void setValue(double valueIn) {
      value = valueIn;
   }
   /**
  *get alternative fuel method.
  *@return altfuel = alternate feul.
  */  
   public boolean getAlternativeFuel() {
      return altfuel;
   }
    /**
  *set alternative fuel method.
  *@param altfuelIn = alternate feul.
  */
   public void setAlternativeFuel(boolean altfuelIn) {
      altfuel = altfuelIn;
   }
   /**
  *get vehiclecount method.
  *@return vehicle count = number of vehicles.
  */
   public static int getVehicleCount() {
      return vehiclecount;
   }
    /**
  *reset vehiclecount method.
  */
   public static void resetVehicleCount() {
      vehiclecount = 0;
   }
   /**
  *use tax method.
  *@return -
  */ 
   public abstract double useTax();
   /**
  *toString method.
  *@return owner = all the stuff.
  */
   
   public String toString() {
      DecimalFormat formated = new DecimalFormat("$#,##0.00#");
      String value2 = formated.format(getValue());
      String usetax2 = formated.format(useTax());
      if (!this.getAlternativeFuel()) { 
         return owner + ": " + this.getClass().getName() + " "
            + yearmakemodel + "\nValue: " + value2 + " Use Tax: " + usetax2; }
      else {
         return owner + ": " + this.getClass().getName() + " " 
            + yearmakemodel + " (Alternative Fuel)\nValue: " + value2
            + " Use Tax: " + usetax2;
      }
   }
}