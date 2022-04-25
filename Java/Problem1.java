/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Problem1 {
    public static void main(String[] args) {
        int limit = 1000;
        int sum = 0;
        for (int cont = 0; cont < limit; cont++) {
            if (cont % 3 == 0) {
                sum += cont;
            } else if (cont % 5 == 0) {
                sum += cont;
            }
        }
        System.out.println(sum);
    }
}
