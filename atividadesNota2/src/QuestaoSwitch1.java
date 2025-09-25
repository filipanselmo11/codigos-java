import java.util.Scanner;

public class QuestaoSwitch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");

        int codigo = scanner.nextInt();

        switch(codigo) {
            case 1:
                System.out.println("Alimento nao perecivel");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecivel");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene pessoal");
                break;
            case 8, 9, 10, 11, 12, 13, 14, 15:
                System.out.println("Limpeza e utensilios domesticos");
                break;
            default:
                System.out.println("Codigo invalido");
                break;
        }

        scanner.close();
    }   
}
