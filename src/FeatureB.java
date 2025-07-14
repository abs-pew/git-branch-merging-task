public class FeatureB {

    public static void main(String[] args) {
        System.out.println("Das ist Feature B von: Shakib ");

        int a = 1;
        int b = 2;
        System.out.println(addInts(a, b));
        System.out.println(subtractInts(a, b));
        System.out.println(multiplyInts(a, b));
        System.out.println(divideInts(a, b));
        System.out.println("Added by Abdul.");
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
