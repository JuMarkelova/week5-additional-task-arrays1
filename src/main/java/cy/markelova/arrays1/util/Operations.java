package cy.markelova.arrays1.util;

public class Operations {

    public static int countNumberOfEven(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++;
        }
        return count;
    }

    public static int countNumberOfOdd(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 1) count++;
        }
        return count;
    }

    public static int countNumberOfPrime(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            boolean isPrime = true;
            if (number < 0 || number == 1) continue;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }
}
