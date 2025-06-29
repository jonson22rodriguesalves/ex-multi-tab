
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class MultiTab {

    /**
     * Método principal que inicia a execução do programa
     * @param args - Argumentos de linha de comando (não utilizado neste programa)
     */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do sistema padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // Exibe o cabeçalho do programa
        System.out.println("=== MULTI TAB ===");
        // Solicita ao usuário que digite um número
        System.out.print("Digite um número Inteiro para gerar a tabuada: ");

        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();

        // Exibe o cabeçalho da tabuada
        System.out.println("\nTabuada do " + numero + ":");
        System.out.println("-------------------");

        /*
         * Loop for que gera a tabuada:
         * - Inicia em 1 (i = 1)
         * - Continua enquanto i for menor ou igual a 10
         * - Incrementa i em 1 a cada iteração (i++)
         */
        for (int i = 1; i <= 10; i++) {
            // Calcula o resultado da multiplicação
            int resultado = numero * i;

            // Exibe a linha formatada da tabuada:
            // %d - formata como inteiro
            // %2d - formata como inteiro com 2 dígitos (alinhamento)
            // %3d - formata como inteiro com 3 dígitos (alinhamento)
            // %n - nova linha
            System.out.printf("%d x %2d = %3d%n", numero, i, resultado);
        }

        // Exibe o rodapé da tabuada
        System.out.println("-------------------");

        // Fecha o objeto Scanner para liberar recursos do sistema
        scanner.close();
    }
}