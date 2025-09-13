public class BinaryToDecimal {
    public static void main(String[]args){
        DecToBin(101);
    }
    public static void DecToBin(int BinNum){
        int MyNum=BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0){
            int LastDigit=BinNum%10;
            DecNum=DecNum+(LastDigit*(int)Math.pow(2, pow));
            pow++;
            BinNum=BinNum/10;
        }
        System.out.println("DECIMAL NUMBER OF "+MyNum+" ="+DecNum);

    }
}
