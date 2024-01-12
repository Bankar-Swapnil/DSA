public class PrimeNumbers {
    public static void main(String[] args) {
        int lowerLimit = 0;
        int upperLimit = 50;

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        printPrimeNumbers(lowerLimit, upperLimit);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrimeNumbers(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
