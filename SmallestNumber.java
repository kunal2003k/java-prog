import java.util.Scanner;
public class SmallestNumber{
    public static void main(String args[]){
        int n1, n2, n3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
    
        if(n1<n2 && n1<n3){
            System.out.println(n1 + " is the smallest number");
        }
        else if(n2<n3){
            System.out.println(n2 + " is the smallest number");
        }
        else{
            System.out.println(n3 + " is the smallest number");
        }
    }
}