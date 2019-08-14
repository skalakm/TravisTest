package thePackage;
import static org.junit.Assert.*;
import org.junit.Test;
class TestClass{

public static void main(String[] args){
System.out.println("hello");
}
  
  public static int sum(int a, int b){
    return a+b;
  }


 @Test
 public void testSomething(){
	assertEquals("4 is not 4",4,4);
}

}
