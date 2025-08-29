public class Pizza {
    public static void main(String[] args) {
        int x = 1;

        while(x <= 5) {
            if (x < 5) {
                System.out.println("Pedir mais uma pizza");
            } else {
                System.out.println("Não pedir mais pizza");
            }

            x = x + 1;
        }
    }
}
