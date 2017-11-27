import java.util.Scanner;

public class primenumber {
    public static void main (String args[]){
    java.util.Scanner sc = new java.util.Scanner(System.in);
        int a;

    boolean cha=false;
                while(sc.hasNext())
    {
        cha=false;
        a=sc.nextInt();
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {cha=true;System.out.println("非質數");break;}
        }
        if(cha==false)
        {
            System.out.println("質數");
        }
    }
}
}

