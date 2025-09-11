import java.util.Scanner;

public class P5 {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n=sc.nextInt();
      int i=0;
      if(n==0){
        i=1;
      }else{
        while(n!=0){
            n=n/10;
            i++;
        }
      }
      System.out.println(i);
      }

}
