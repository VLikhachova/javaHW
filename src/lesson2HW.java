public class lesson2HW {
    public static void main(String[] args){
        int max=20;
        int min=-20;
        int a=(int)Math.floor(Math.random()*(max-min+1)+min);
        int b=(int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(sumCheck(a,b));
        int x=(int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(negativeNumCheck(x));
        String ex="Example string";
        int r=(int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(stringRep(ex, r));
        int year=1600;
        System.out.println(yearCheck(year));
    }
    public static boolean sumCheck(int a, int b) {
        boolean result;
        if (a+b>=10 && a+b<=20) {
            result=true;
        } else {
            result=false;
        }
        return result;

    }
    public static String negativeNumCheck(int x) {
        String result;
        if (x<=0){
            result="Negative";
        } else {
            result="Positive";
        }
        return result;
    }
    public static String stringRep(String ex, int r){
        String result;
        result=ex;
        for (int i=1; i<=r; i++)
            result=result+"\n"+ex;;
        return result;
    }
    public static boolean yearCheck(int year){
        boolean result;
        if (year%4==0 || (year%400==0 && year%100==0)) {
            result = true;
        } else {
        result = false;
    }
        return result;
    }
}