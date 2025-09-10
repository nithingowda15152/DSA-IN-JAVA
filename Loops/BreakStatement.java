import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      for(;;){
        int n=sc.nextInt();
        if(n%10==0){
            System.out.println("YOU ENTERED MULTIPLE OF 10");
            break;
        }else{
        System.out.println("ENTER AGAIN");
        }
      }
      sc.close();
      }


}
