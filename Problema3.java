public class Problema3 {
    /*
           The prime factors of 13195 are 5, 7, 13 and 29.
           What is the largest prime factor of the number 600851475143 ?
   */
    public static void main(String[] args) {
        long number = 600851475143L;
        long primeLimit = (int) Math.ceil(Math.sqrt(number));//Comprobar valores primos hasta este valor
        long cont = 2;
        long fprimo = 0;
        long dividendo = number;
        while (cont <= primeLimit) {
            while (dividendo % cont == 0) {
                fprimo = cont;
                dividendo /= cont;
            }
            cont++;
        }
        if (dividendo != 1) {
            fprimo = dividendo;
        }
        System.out.println(fprimo);
    }
}
