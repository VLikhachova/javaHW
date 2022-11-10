public class lesson1HW {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int min = -50;
        int max = 50;
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        if ((a+b) >= 0) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int min = -200;
        int max = 600;
        int value = (int)Math.floor(Math.random()*(max-min+1)+min);
        if (value <=0) {
            System.out.println("Red");
        } else if (value >0 && value <=100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int min = -50;
        int max = 50;
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
