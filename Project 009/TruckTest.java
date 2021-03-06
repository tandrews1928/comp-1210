import org.junit.Assert;
import org.junit.Test;

/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/ 
public class TruckTest {
/** gettonstest. */
   @Test public void getTonstest() {
      Truck truck1 = new Truck("Williams, Jo",
          "2012 Chevy Silverado", 30000, false, 1.5);
   
      Assert.assertEquals("getTons test", 1.5, truck1.getTons(), 0.01);
   }
/** settonstest. */  
   @Test public void settonstest() {
      Truck truck1 = new Truck("Jones, Sam", "2017 Honda Accord",
          22000, false, 1.5);
      truck1.setTons(3.5);
      
      Assert.assertEquals(3.5, truck1.getTons(), 0.01);
   }

   /** usetaxtest. */
   @Test public void usetaxtest() {
      Truck truck1 = new Truck("Williams, Jo",
          "2012 Chevy Silverado", 30000, false, 1.5);
      Truck truck3 = new Truck("Williams, Jo",
          "2012 Chevy Silverado", 30000, true, 2.5);
      Truck truck2 = new Truck("Williams, Sam",
          "2010 Chevy Mack", 40000, false, 2.5);
      Truck truck4 = new Truck("Williams, Sam",
          "2010 Chevy Mack", 40000, true, 1.5);
               
      Assert.assertEquals("usetax test", 600.00, truck1.useTax(), 0.01);
      Assert.assertEquals("usetax test", 2000.00, truck2.useTax(), 0.01);
      Assert.assertEquals("usetax test", 1200.00, truck3.useTax(), 0.01);
      Assert.assertEquals("usetax test", 400.00, truck4.useTax(), 0.01);
   }
   /** tostringtest. */
   @Test public void toStringtest() {
      Truck truck1 = new Truck("Williams, Jo",
          "2012 Chevy Silverado", 30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam",
          "2010 Chevy Mack", 40000, true, 2.5);
         
      Assert.assertEquals("toString test", true,
          truck1.toString().contains("with Tax Rate: 0.02"));
      Assert.assertEquals("toString test", true,
          truck2.toString().contains("with Tax Rate: 0.01 Large"
            + " Truck Tax Rate: 0.03"));
   }
    
   
}
