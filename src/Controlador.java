public class Controlador {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Calculadora calc = new Calculadora();

        double resultadoAnterior = 0;
        boolean temResultado = false;

        System.out.println("Bem vindo");

        while (true) {

            double val1;

            // 👇 PRIMEIRO: decide o valor inicial
            if (temResultado && entrada.usarResultadoAnterior()) {
                val1 = resultadoAnterior;
                System.out.println("Usando resultado anterior: " + val1);
            } else {
                val1 = entrada.lerNumero("Digite o primeiro número: ");
            }

            // 👇 DEPOIS escolhe a operação
            String sinal = entrada.lerOperacao();

            double val2 = entrada.lerNumero("Digite o segundo número: ");

            double resultado = calc.calcular(val1, val2, sinal);

            System.out.println("Resultado ----> " + resultado);

            resultadoAnterior = resultado;
            temResultado = true;

            // 👇 POR ÚLTIMO decide se continua
            String continuar = entrada.perguntarContinuar();

            if (continuar.equalsIgnoreCase("Não")) {
                break;
            }
        }

        System.out.println("Calculadora desligando...");
        System.out.println("Obrigado por usar!");
    }
}
