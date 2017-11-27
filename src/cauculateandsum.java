public class cauculateandsum {
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num,sum=0;
        num = sc.nextInt();
        for(int a=3;a<=num;a=a+3){
            sum+=a;
        }
        System.out.println(sum);
    }
}


