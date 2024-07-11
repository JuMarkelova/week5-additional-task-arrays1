package cy.markelova.arrays1.util;

public class Operations {

    public static int countNumberOfEven(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNumberOfOdd(int[] numbers) {
        return numbers.length - countNumberOfEven(numbers);
    }

    public static int countNumberOfPrime(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            boolean isPrime = true;
            if (number < 0 || number == 1) {
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }

    public static int sumOfAll(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int countDifEvenOddIndexes(int[] numbers) {
        int sumOfEvenIndexes = 0;
        int sumOfOddIndexes = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sumOfEvenIndexes += numbers[i];
        }
        for (int i = 1; i < numbers.length; i += 2) {
            sumOfOddIndexes += numbers[i];
        }
        return sumOfEvenIndexes - sumOfOddIndexes;
    }

    public static int countNumberOfZero(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number == 0) {
                count++;
            }
        }
        return count;
    }
}