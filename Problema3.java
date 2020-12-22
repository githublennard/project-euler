public class Problema3 {
/*
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
*/
    public static void main(String[] args) {
        //long limit = 600851475143L;
        int limit = 13195;
        int aux = 0;
        int div =1;
        while(div < limit){
            if(limit % div == 0){
                aux = div;
            }
            div ++;
        }
        /*for(int cont=1; cont < limit ; cont++  );{
            //div += 1;
            if(limit % cont == 0){
                aux =div;
                 }
            }*/
        System.out.println(aux);
    }
}