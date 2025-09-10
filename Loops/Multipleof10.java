import java.util.Scanner;

public class Multipleof10 {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      do {
        System.out.print("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        if (n%10==0){
            System.out.println("YOU ENTERED MULTIPLE OF 10");
            break;
        } 
        System.out.println("ENTER AGAIN");
          
      } while (true);

      }

}
