package pjt;

import org.testng.annotations.Test;

public class NewTestdemo {
  @Test(priority=3)
  public void test_b() {
	  
	  System.out.println("Running b");
  }
  
  @Test(priority=2)
  public void test_a()
  {
	  System.out.println("Running a");
  }
  @Test(priority=1)
  public void test_c()
  {
	  System.out.println("Running c");
  }
}
