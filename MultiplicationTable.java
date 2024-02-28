public class MultiplicationTable
{
     public static void main(String []args)
     {
	Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();      
        int i=1;
        System.out.println("The multiplication table of "+n+" is: ");
        while(i<=10)
        {
           System.out.println(n+" * "+i+" = "+ (n*i));
            i++;
        }  
     }
}
