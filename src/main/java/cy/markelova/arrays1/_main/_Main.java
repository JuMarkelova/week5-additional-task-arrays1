package cy.markelova.arrays1._main;

import cy.markelova.arrays1.util.Operations;

public class _Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.println(Operations.countNumberOfEven(numbers));
        System.out.println(Operations.countNumberOfOdd(numbers));
        System.out.println(Operations.countNumberOfPrime(numbers));
        System.out.println(Operations.sumOfAll(numbers));
        System.out.println(Operations.countDifferenceBetweenSumEvenAndOddIndexes(numbers));
        System.out.println(Operations.countNumberOfZero(numbers));
    }
}