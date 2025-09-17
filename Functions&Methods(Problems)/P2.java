import java.util.*;
public class P2 {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
            
        }
        
    }
}
