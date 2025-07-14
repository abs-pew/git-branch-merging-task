public class FeatureB {

    public static void main(String[] args) {
        System.out.println("Das ist Feature B von: Shakib!");
        int c = 4;
        System.out.println("Das ist Feature B von: Shakib ");

        int a = 1;
        int b = 2;
        System.out.println(addInts(a, b));
        int d = 10;

        System.out.println("Das ist eine Änderung von Regina.");

        System.out.println(subtractInts(d, c));
    }
    public static int addInts(int a, int b) {
        return a + b;
    }
    public static int subtractInts(int a, int b) {
        return a - b;
    }
    public static int multiplyInts(int a, int b) {
        return a * b;
    }
    public static int divideInts(int a, int b) {
        return a / b;
    }
}
