public class P6 {
    public static void main(String[] args) {
      int rows = 4;

        for (int i = 1; i <= rows; i++) {  // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for stars
                System.out.print("*");
            }
            System.out.println(); 
      }
    }

}
