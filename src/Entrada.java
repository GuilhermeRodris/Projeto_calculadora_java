import java.util.Scanner;

public class Entrada {
    Scanner sc = new Scanner(System.in);

    public String lerOperacao() {
        System.out.println("Informe a operação (+, -, *, /): ");
        return sc.nextLine();
    }

    public double lerNumero(String msg) {
        System.out.println(msg);
        double valor = sc.nextDouble();
        sc.nextLine(); // limpar buffer
        return valor;
    }

    public String perguntarContinuar() {
        String resposta;

        while (true) {
            System.out.println("Gostaria de realizar outra conta? (Sim ou Não)");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("Não")) {
                return resposta;
            }

            System.out.println("Resposta inválida! Digite apenas Sim ou Não.");
        }
    }

    public boolean usarResultadoAnterior() {
        String resposta;

        while (true) {
            System.out.println("Deseja usar o resultado anterior como primeiro número? (Sim ou Não)");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("Sim")) {
                return true;
            }
            if (resposta.equalsIgnoreCase("Não")) {
                return false;
            }

            System.out.println("Resposta inválida!");
        }
    }
}
