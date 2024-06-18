import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parameter1 = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parameter2 = scanner.nextInt();

        try {
            counter(parameter1, parameter2);
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    private static void counter(int parameter1, int parameter2) throws InvalidParametersException {
        if (parameter2 < parameter1) {
            throw new InvalidParametersException();
        }
        int counting = parameter2 - parameter1;
        for (int i = 1; i <= counting; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
