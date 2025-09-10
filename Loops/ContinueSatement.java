public class ContinueSatement {
      public static void main(String[] args) {
    int n=1;
    while(n<=5){
        if(n==3){
            n++;
            continue;
        }
        System.out.print(n+" ");
        n++;
    }
}

}
