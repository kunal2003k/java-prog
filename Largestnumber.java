package kunal;

import java.util.Scanner;
public class Largestnumber {
       public static void main(String[]args) {
    	   int a,b,c,temp,largest;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter the first no:");
    	   a=sc.nextInt();
    	   System.out.println("enter the second no:" );
    	   b=sc.nextInt();
    	   System.out.println("enter the third no:");
    	   c=sc.nextInt();
    	   temp=a>b?a:b;
    	   largest=c>temp?c:temp;
    	   System.out.println("the largest no is:"+largest);
    			   
       }
}
