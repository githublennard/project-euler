public class Problema2 {
    public static void main(String[] args) {
        int limit = 4_000_000;
        int var1 = 1;
        int var2 = 2;
        int sumeven =var2;

        while (var1 + var2 < limit) {
            int next = var1 + var2;
            var1 = var2;
            var2 = next;

            if(next % 2 == 0){
                sumeven += next;
            }
        }
        System.out.println(sumeven);

    }
}
