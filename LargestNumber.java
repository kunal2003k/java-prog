import java.util.Scanner;
public class LargestNumber{
    public static void main(String args[]){
        int n1, n2, n3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
    
        if(n1>n2 && n1>n3){
            System.out.println(n1 + " is the largest number");
        }
        else if(n2>n3){
            System.out.println(n2 + " is the largest number");
        }
        else{
            System.out.println(n3 + " is the largest number");
        }
    }
}