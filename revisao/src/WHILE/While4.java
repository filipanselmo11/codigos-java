package WHILE;

public class While4 {
    public static void main(String[] args) {

        int i = 1;//int contador, aqui pode ser o nome que achar melhor. O mais comum é i, contador ou j

        while(i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
