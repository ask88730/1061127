import java.util.Scanner;

public class spring {
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("please enter month");
        int month = sc.nextInt();
        if(month > 0 && month < 4){
            System.out.println("Spring!");
        }
        else if(month > 3&& month < 7){
            System.out.println("Summer!");
        }
        else if(month > 6&& month < 10){
            System.out.println("Autumn!");
        }
        else
            System.out.println("Winter!");

    }
    }

