import java.util.Scanner;

    public class BinarioParaDecimal {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite até 8 dígitos binários:");
                String input = scanner.nextLine();

                if (binarioValido(input)) {
                    int decimalEquivalente = binarioParaDecimal(input);
                    System.out.println("Decimal Equivalente: " + decimalEquivalente);
                } else {
                    System.out.println("Entrada inválida. Certifique-se de inserir apenas 0 ou 1.");
                }
            }

            private static boolean binarioValido(String input) {
                return input.matches("[01]+") && input.length() <= 8;
            }

            private static int binarioParaDecimal(String binario) {
                int decimalEquivalente = 0;

                for (int i = 0; i < binario.length(); i++) {
                    int digito = binario.charAt(i) - '0';
                    decimalEquivalente = decimalEquivalente * 2 + digito;
                }

                return decimalEquivalente;
            }
    }
