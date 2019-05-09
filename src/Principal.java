
/**
 * 
 * Classe para execução da primeira lista de exercícios.
 * 
 * @author Jean Ribeiro
 * @version 1.0
 * 
 */
public class Principal {

	/**
	 * Função para inicialização do exercício.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean continuar = true;

		do {
			String[] opcoes = { "Calculo PA", "Calculo da Distancia entre pontos", "Calculo média",
					"Calculo Media Ponderada", "Calculo Media Harmonica", "Conversão Temperatura", "Volume do Cilindro",
					"Consumo de Combustivel", "Compra com acrescimo" };
			int opcao = Console.mostrarMenu(opcoes, "Lista01", null);

			switch (opcao) {
			case 1:
				calcularEnesimoTermoDaPA();
				break;

			case 2:
				calcularDistanciaEntrePontos();
				break;

			case 3:
				calcularMediaAritmetica();
				break;

			case 4:
				calcularMediaPonderada();
				break;

			case 5:
				calcularMediaHarmonica();
				break;

			case 6:
				calcularConversaoTemperatura();
				break;

			case 7:
				calcularVolumeCilindro();
				break;

			case 8:
				calcularConsumoCombustivel();
				break;

			case 9:
				calcularPercentual();
				break;

			case -1:
				System.out.println("Saindo...");
				continuar = false;
				break;
			}

		} while (continuar == true);

	}

	/**
	 * Realizar o cálculo do enésimo termo da PA pelo teclado.
	 */
	public static void calcularEnesimoTermoDaPA() {

		int a1 = Console.recuperaInteiro("informe o a1:");
		int n = Console.recuperaInteiro("Informe o n:");
		int r = Console.recuperaInteiro("Informe o r:");

		int an = Exercicio.calcularEnesimoTermoDaPA(a1, n, r);

		System.out.println("O resultado é: " + an);

	}

	/**
	 * Realiza o calculo da media de três notas informadas.
	 */
	public static void calcularMediaAritmetica() {
		double n1 = Console.recuperaDecimal("Informe a primeira nota: ");
		double n2 = Console.recuperaDecimal("Informe a segunda nota: ");
		double n3 = Console.recuperaDecimal("Informe a terceira nota: ");

		double media = Exercicio.calcularMediaAritmetica(n1, n2, n3);

		System.out.println("A media aritmetica é: " + media);
	}

	/**
	 * Realiza o calculo da distancia entre dois pontos.
	 */
	public static void calcularDistanciaEntrePontos() {
		double x1 = Console.recuperaDecimal("Informe x1: ");
		double x2 = Console.recuperaDecimal("Informe x2: ");
		double y1 = Console.recuperaDecimal("Informe y1: ");
		double y2 = Console.recuperaDecimal("Informe y2: ");
		double distancia = Exercicio.calcularDistanciaEntrePontos(x1, y1, x2, y2);

		System.out.println("A distancia entre os dois pontos é: " + distancia);
	}

	/**
	 * Realiza o calculo da media ponderada.
	 */
	public static void calcularMediaPonderada() {
		double nota1 = Console.recuperaDecimal("Informe a primeira nota: ");
		double nota2 = Console.recuperaDecimal("Informe a segunda nota: ");
		double nota3 = Console.recuperaDecimal("Informe a terceira nota: ");
		int peso1 = Console.recuperaInteiro("Informe o peso 1");
		int peso2 = Console.recuperaInteiro("Informe o peso 2");
		int peso3 = Console.recuperaInteiro("Informe o peso 3");
		double mediapodenrada = Exercicio.calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);

		System.out.println("A media ponderada é: " + mediapodenrada);

	}

	/**
	 * Realiza o calculo da media harmonica.
	 */
	public static void calcularMediaHarmonica() {
		double nota1 = Console.recuperaDecimal("Informe a primeira nota: ");
		double nota2 = Console.recuperaDecimal("Informe a segunda nota: ");
		double nota3 = Console.recuperaDecimal("Informe a terceira nota: ");
		double mediaharminica = Exercicio.calcularMediaHarmonica(nota1, nota2, nota3);

		System.out.println("A media harmonica é: " + mediaharminica);
	}

	/**
	 * Realiza o calculo da conversão de temperatura.
	 */
	public static void calcularConversaoTemperatura() {
		double temperatura = Console.recuperaDecimal("Informe a temperatura: ");
		double fahrenheit = Exercicio.calcularConversaoTemperatura(temperatura);

		System.out
				.println("A temperatura de " + temperatura + " celsius é equivalente a " + fahrenheit + " fahrenheit");
	}

	/**
	 * Realiza o calculo do volume de um cilindro.
	 */
	public static void calcularVolumeCilindro() {
		double raio = Console.recuperaDecimal("Informe o Raio do cilindro: ");
		double altura = Console.recuperaDecimal("Informe a altura do cilindro: ");
		double volume = Exercicio.calcularVolumeCilindro(raio, altura);

		System.out.println("O volume do cilindro é: " + volume);
	}

	/**
	 * Realiza o calculo de consumo de combustivel de um veiculo em uma viagem.
	 */
	public static void calcularConsumoCombustivel() {
		int velocidade = Console.recuperaInteiro("Informe a velocidade media do veiculo: ");
		int tempo = Console.recuperaInteiro("informe o tempo de viagem em minutos: ");
		double consumo = Exercicio.calcularConsumoCombustivel(velocidade, tempo);

		System.out.println("Foram gastos " + consumo + " litros na viagem.");
	}

	/**
	 * Realiza o calculo de um valor mais o percentual desejado.
	 */
	public static void calcularPercentual() {
		double valor = Console.recuperaDecimal("Informe o valor desejado: ");
		double percent = Console.recuperaDecimal("Informe o percentual desejado: ");
		double valorFinal = Exercicio.calcularPercentual(valor, percent);

		System.out.println("O valor a ser pago é:R$ " + valorFinal);

	}
}
