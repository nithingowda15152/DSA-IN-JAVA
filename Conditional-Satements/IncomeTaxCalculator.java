import java.util.Scanner;

public class IncomeTaxCalculator {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int INCOME = sc.nextInt();
      int TAX;
      if(INCOME<500000){
        TAX=0;
      }
      else if((INCOME>=500000)&&(INCOME<=1000000    )){
        TAX=(INCOME*10/100);
              }else{
              TAX=(int)(INCOME*0.2);
      }
      System.out.println("TAX IS:"+ TAX);
      }

}
