import java.util.Scanner;

public class NotaSwitch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota: ");
        int nota = entrada.nextInt();

        entrada.close();

        switch(nota) {
            case 7:
                System.out.println("Aprovado");
                break;
            case 6:
                System.out.println("Recuperação");
                break;
            case 5:
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }
    }
}
