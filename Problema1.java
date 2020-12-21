public class Problema1 {
    public static void main(String[] args) {
        //1000  3 o 5
        int limit = 1000;
        int sum = 0;
        for(int cont= 0; cont < limit; cont++    ){
            if (cont % 3 == 0){
                sum += cont ;
            }
            else if (cont %5 ==0){
                sum += cont;
            }
        }
        System.out.println(sum);

    }
}
