public class NumerosImpares {
    public static void main(String[] args) {

        int contador, resto;

        contador = 0;
        
        while(contador < 20) {
            resto = contador % 2;

            if(resto != 0) {
                System.out.println(contador);
            }

            contador = contador + 1;
        } 

    }
}
