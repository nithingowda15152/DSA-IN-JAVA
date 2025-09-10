import java.util.Scanner;

public class ContinuePractice {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
       for(;;){
        int n = sc.nextInt();
        if(n%10==0){
            System.out.println("NOT ACCEPTABLE");
            n++;
            continue;
        }
        System.out.println(n);
    }
}

}
