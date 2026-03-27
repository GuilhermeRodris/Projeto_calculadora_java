public class Calculadora {

    public double calcular(double val1, double val2, String sinal) {
        switch (sinal){
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                if (val2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return 0;
                }
                return val1 / val2;
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }
}
