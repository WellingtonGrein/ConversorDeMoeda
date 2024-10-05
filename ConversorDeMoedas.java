import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorDeMoedas {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Conversor de Moedas");

        System.out.println("Selecione a moeda de origem:");
        TipoMoeda moedaOrigem = selecionarMoeda(scanner);

        System.out.print("Digite o valor que deseja converter: ");
        double valor = scanner.nextDouble();

        System.out.println("Selecione a moeda de destino:");
        TipoMoeda moedaDestino = selecionarMoeda(scanner);

        double valorConvertido = moedaOrigem.converterPara(moedaDestino, valor);
        System.out.printf("Valor convertido: %s %.2f\n", moedaDestino.getNome(), valorConvertido);

        scanner.close();
    }

    private TipoMoeda selecionarMoeda(Scanner scanner) {
        TipoMoeda[] moedas = TipoMoeda.values();

        for (int i = 0; i < moedas.length; i++) {
            System.out.println((i + 1) + ". " + moedas[i].getNome());
        }

        int escolha;
        do {
            System.out.print("Escolha uma moeda (1-" + moedas.length + "): ");
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha > moedas.length);

        return moedas[escolha - 1];
    }

    public static void main(String[] args) {
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        conversor.iniciar();
    }
}
