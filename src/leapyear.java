public class leapyear {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String Input;
        for (int i = 0; i < 1; i = 0) {
            System.out.println("請輸入西元年分：");
            Input = sc.nextLine();
            int Output = Integer.parseInt(Input);

            if (Output < 1)
                System.out.println("資料有誤");
            else {
                if (Output % 400 == 0 || ((Output % 4 == 0) && (Output % 100 != 0)))
                    System.out.println(Input + "是閏年");
                else
                    System.out.println(Input + "非閏年");

                for (int j = 0; j < 1; j = 0) {
                    System.out.println("是否繼續?(Y/N)");
                    Input = sc.nextLine();
                    if (Input.charAt(0) == 'N' || Input.charAt(0) == 'n')
                        System.exit(0);
                    else {
                        if (Input.charAt(0) == 'Y' || Input.charAt(0) == 'y')
                            break;
                        else
                            continue;

                    }
                }
            }
        }
    }
}

