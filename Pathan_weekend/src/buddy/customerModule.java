package buddy;

//import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customerModule {
 @Test (priority = 1)
 public void createCustomer() {
	 Reporter.log("create customer",true);
}
 @Test(priority = 2)
public void modifyCustomer(){
	 Reporter.log("modify customer",true);
 }
 @Test(priority = 3,dependsOnMethods = "modifyCustomer") 
 public void AddphnoCustomer(){
 	 Reporter.log("Addphno customer",true);
  }
 @Test(priority = 4,dependsOnMethods = "customerModule")
 public void deleteCustomer() {
	 Reporter.log("delete customer", true);
 }
 
}
