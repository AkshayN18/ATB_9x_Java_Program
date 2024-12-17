package Dec2024.HandsOnW1;

public class Example002 {
    public static void main(String[] args) {
        int N1 = 100;
        int N2 = 0;

        int Answer = CheckSum(N1, N2);
        System.out.println("Check = " + Answer);
    }

    private static int CheckSum(int N1, int N2) {
        int Check;
        int Sum = N1 + N2;
        if(Sum < 100)
        {  Check = 0;
        }
        else if(Sum > 100)
        {  Check = 1;
        }
        else
        {  Check = 2;
        }
        return Check;
    }
}