public class ProductFunctionCalling {
    public static int product(int a,int b){
        int prod=(a*b);
        return prod;
    }
    public static void main(String[] args) {
        int a =3;
        int b=5;
        int result=product(a,b);
        System.out.println("THE PRODUCT OF TWO NUMBERS IS: "+result);
    }
}
