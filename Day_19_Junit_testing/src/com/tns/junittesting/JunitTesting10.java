package com.tns.junittesting;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class JunitTesting10 {

   String message = "Robert";	
     JunitTesting10 messageUtil = new JunitTesting10(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}


