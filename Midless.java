import java.util.*;
public class Midless{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(b<c)
            System.out.println("b is small");
            else if(a<c)
            System.out.println("c is small");
            else
            System.out.println("a is smaller");
        }
        else
        {
            if(a<c)
            System.out.println("a is smaller");
            else if(b<c)
            System.out.println("c is smaller");
            else
            System.out.println("b is smaller");
        }
    }
}