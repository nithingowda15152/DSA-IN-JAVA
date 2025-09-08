import java.util.Scanner;
public class problem {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   float pen=sc.nextFloat();
   float pencil=sc.nextFloat();
   float eraser=sc.nextFloat();
   float total = pencil + pen + eraser ;
   System.out.println("Bill is: " +total);
   float NewTotal = total+(total*0.18f);
   System.out.println("Bill with 18& GST is:" + NewTotal);
  }  
}
