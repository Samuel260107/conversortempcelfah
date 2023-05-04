
public class Conversortempcelfah {
	public static void main(String[] args) {
		//Declaração de variáveis
		double fah, cel;
		
		//Criação e instância do objeto de entrada
		Scanner conta = new Scanner(System.in);
		
		//Apresentação
		System.out.print("\n\t\t\t --- Calculadora Celsius para Fahreinheint --- \n");
		
		//Entrada
		System.out.print("Informe Cel: ");
		cel = conta.nextDouble();
		
		//Processamento
		fah = 9*cel/5 + 32;
				
		//Saída
		System.out.println("\n\n" + "Cel: " + cel + " = " + "Fah: " + fah);
		
		
	}

}
