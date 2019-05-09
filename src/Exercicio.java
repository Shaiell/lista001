/**
 * Classe para executar os exercicios da lista 01.
 * 
 * @author Jean Ribeiro
 *
 */
public class Exercicio {

	/**
	 * Realiza o calculo do enésimo termo da PA de acordo com a equação. an = a1 +
	 * (n - 1) * r;
	 * 
	 * @param a1 Primeiro termo da PA
	 * @param n  Índice do enésimo termo procurado.
	 * @param r  Razão da PA.
	 * @return O enésimo termo da PA.
	 */
	public static int calcularEnesimoTermoDaPA(int a1, int n, int r) {
		int an = a1 + (n - 1) * r;
		return an;
	}

	/**
	 * Calcula a media aritmetica de 3 valores, conforme a equação: (n1+n2+n3)/3.
	 * 
	 * @param n1 nota 1
	 * @param n2 nota 2
	 * @param n1 nota 3
	 * @return media aritmetica.
	 */
	public static double calcularMediaAritmetica(double n1, double n2, double n3) {

		return (n1 + n2 + n3) / 3;

	}

	/**
	 * Realiza o calculo de distancia entre dois pontos conforme pitagoras.
	 * 
	 * @param x1 cordenada x do ponto 1
	 * @param y1 cordenada y do ponto 1
	 * @param x2 cordenada x do ponto 2
	 * @param y2 cordenada y do ponto 2
	 * @return a distancia entre os pontos.
	 */
	public static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	/**
	 * Realiza o calculo de media ponderada.
	 * 
	 * @param nota1 primeira nota inserida.
	 * @param nota2 segunda nota inserida.
	 * @param nota3 terceira nota inserida.
	 * @param peso1 Peso na primeira nota.
	 * @param peso2 Peso na segunda nota.
	 * @param peso3 Peso na terceira nota.
	 * @return a media ponderada das notas fornecidas.
	 */
	public static double calcularMediaPonderada(double nota1, double nota2, double nota3, int peso1, int peso2,
			int peso3) {

		return ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3));
	}

	/**
	 * Realiza o calculo da media Harmonica
	 * 
	 * @param nota1 primeira nota inserida.
	 * @param nota2 segunda nota inserida.
	 * @param nota3 terceira nota inserida.
	 * @return a media harminica das notas inseridas
	 */
	public static double calcularMediaHarmonica(double nota1, double nota2, double nota3) {

		return (3 / (1 / nota1 + 1 / nota2 + 1 / nota3));
	}

	/**
	 * Tranforma a temperatura de Celsius para Fahrenheit.
	 * 
	 * @param temperatura dado informado pelo usuario para conversão.
	 * @return a temperatura em Fahrenheit
	 */
	public static double calcularConversaoTemperatura(double temperatura) {

		return (9 * temperatura + 160) / 5;

	}

	/**
	 * Calcula o volume de um cilindo.
	 * 
	 * @param raio   tamanho do raio do cilindro
	 * @param altura tamanho da altura do cilindro.
	 * @return retorno o volume do cilindro.
	 */
	public static double calcularVolumeCilindro(double raio, double altura) {

		return 3.14 * Math.pow(raio, 2) * altura;
	}

	/**
	 * Realiza o calculo de consumo de um veiculo em uma viagem considerando gasto
	 * de 12km/L.
	 * 
	 * @param velocidade meio do veiuco no percurso.
	 * @param tempo      do percurso.
	 * @return o gasto de combustivel no percurso.
	 */
	public static double calcularConsumoCombustivel(int velocidade, int tempo) {

		return ((velocidade * tempo) / 60) / 12;
	}

	/**
	 * Realiza o calculo de acrescimo de uma compra ao valor original.
	 * 
	 * @param valor   informado na compra.
	 * @param percent porcentagem a acrescer na compra
	 * @return valor final com acrescimo imbutido.
	 */
	public static double calcularPercentual(double valor, double percent) {
		return (valor * (percent / 100)) + valor;
	}
}
