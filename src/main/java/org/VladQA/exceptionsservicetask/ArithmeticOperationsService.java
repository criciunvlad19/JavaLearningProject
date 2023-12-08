package org.VladQA.exceptionsservicetask;

public class ArithmeticOperationsService {
     public static int divideIntNoExceptionHandling(int a, int b) {
         return a/b;
     }

     public static int divideIntWithExceptionHandling(int a, int b) {
         try {
             int result = a / b;
             return result;
         } catch (ArithmeticException exceptionObject) {
             System.out.println("An exception has occurred: " + exceptionObject.getMessage());
             return 0;
         }
     }

}
