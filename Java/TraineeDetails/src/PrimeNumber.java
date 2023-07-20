import java.util.*;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int n1=s.nextInt();
        System.out.println("Enter the lower limit");
        int n2=s.nextInt();
        CustomPrimeNumber customPrimeNumber=new CustomPrimeNumber();
        customPrimeNumber.PrintPrimeNumber(n1,n2);
    }


}

class CustomPrimeNumber{

    boolean isPrime(int i) {

        int c = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                c++;
            }
        }
        if (c==1){
            return true;
        } else {
            return false;
        }
    }
    void PrintPrimeNumber(int n1,int n2) {
        if(n1<=n2)
        {
            for (int i = n1; i <= n2; i++) {

                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
