package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greaterOfTwo = first>second ? first : second;
        int greatest = third>greaterOfTwo ? third : greaterOfTwo;
        System.out.println(greatest);
    }
}
