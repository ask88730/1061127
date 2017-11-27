

public class tennumbermaxmin {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i, Max, Min, Num;
        Max = -9999999;
        Min = 999999;
        for (i = 1; i <= 10; i++) {
            Num = sc.nextInt();
            if (Num > Max)
            {
                Max = Num;
            }
            if (Num < Min)
            {
                Min = Num;

            }
        }
        System.out.println(Max+"is Max Number");
        System.out.println(Min+"is Min Number");
    }
}



