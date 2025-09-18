public class InvertedPyramidNumber {
    public static void N(int n){
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
          }
    }
    public static void main(String[] args) {
        N(5);
    }
}

