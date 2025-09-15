public class FunctionOverloading {
    public static int parameter(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int parameter(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        int sum=(parameter(1,2,3));
        System.out.println(sum);
    }
}
