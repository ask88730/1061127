public class Stringcodesum {
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n--!=0){
            char arr[]=sc.nextLine().toCharArray();
            int tot=0;
            for(int i=0;i<arr.length;i++){
                tot+=arr[i];
            }
            System.out.println(tot);
        }
    }

    }

