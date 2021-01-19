/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class Problem5 {
    static int gcd(int a, int b) {  // Recursive method to return gcd of a and b
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {  // Method to return LCM of two numbers
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int i, num1 = 1, num2 = 0;
        int temporaryLCM = 0;
        for (i = 1; i < 21; i++) {
            System.out.println("Numbers to calculate LCM are num1: " + num1 + " and " + "num2: " + i);
            temporaryLCM = lcm(num1, i);
            System.out.println("The smallest positive number divisible by num1 and num2 is: " + temporaryLCM + "\n");
            num1 = temporaryLCM;
            num2++;
        }
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + temporaryLCM);
    }
}