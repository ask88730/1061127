

public class springsummerautumnwinter {
public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.print("請輸入您的出生月:");
        int month = sc.nextInt();
        System.out.print("請輸入您的出生日:");
        int day = sc.nextInt();
        String result="輸入有誤";
        switch(month)
        {
        case 1:
        if(day >=1 && day <=20)
        result="魔羯座";
        else if(day>=21 && day<=31)
        result="水瓶座";
        break;
        case 2:
        if(day >=1 && day <=19)
        result="水瓶座";
        else if(day>=20 && day<=29)
        result="雙魚座";
        break;
        case 3:
        if(day >=1 && day <=20)
        result="雙魚座";
        else if(day>=21 && day<=31)
        result="牡羊座";
        break;
        case 4:
        if(day >=1 && day <=20)
        result="牡羊座";
        else if(day>=21 && day<=30)
        result="金牛座";
        break;
        case 5:
        if(day >=1 && day <=21)
        result="金牛座";
        else if(day>=22 && day<=31)
        result="雙子座";
        break;
        case 6:
        if(day >=1 && day <=21)
        result="雙子座";
        else if(day>=22 && day<=30)
        result="巨蟹座";
        break;
        case 7:
        if(day >=1 && day <=23)
        result="巨蟹座";
        else if(day>=24 && day<=31)
        result="獅子座";
        break;
        case 8:
        if(day >=1 && day <=23)
        result="獅子座";
        else if(day>=24 && day<=31)
        result="處女座";
        break;
        case 9:
        if(day >=1 && day <=23)
        result="處女座";
        else if(day>=24 && day<=30)
        result="天秤座";
        break;
        case 10:
        if(day >=1 && day <=23)
        result="天秤座";
        else if(day>=24 && day<=31)
        result="天蠍座";
        break;
        case 11:
        if(day >=1 && day <=22)
        result="天蠍座";
        else if(day>=23 && day<=30)
        result="射手座";
        break;
        case 12:
        if(day >=1 && day <=22)
        result="射手座";
        else if(day>=23 && day<=31)
        result="魔羯座";
        break;
        }
        System.out.print("您的星座是："+result);
        }
        }
