package homework21;

public class Parrots {
    public static void main(String[] args) {
        double boaLength = 380;
        double parrotHeight = boaLength / 38 / 100;
        double monkeyHeight = boaLength / 5 / 100;
        double elephantHeight = boaLength / 2 / 100;
        boaLength /= 100;
        double summaryLength = boaLength + parrotHeight + monkeyHeight + elephantHeight;
        System.out.printf("Boa Length: %.2fm%n", boaLength);
        System.out.printf("Parrot height: %.2fm%n", parrotHeight);
        System.out.printf("Monkey height: %.2fm%n", monkeyHeight);
        System.out.printf("Elephant height: %.2fm%n", elephantHeight);
        System.out.printf("Summary length: %.2fm%n", summaryLength);
    }
}
