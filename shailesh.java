package Ass_Exception1;
import java.util.Scanner;

public class shailesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         try
         {
        	 System.out.println("enter first number");
        	 int a=s.nextInt();
        	 System.out.println("enter second number");
        	 int b=s.nextInt();
        	 int sum=a/b;
        	 System.out.println("sum of two numbers "+sum);
        	 
        	 
         }
         catch(Exception e) {
        	 System.out.println("number cannot divided by zero");
         }
	}

}
