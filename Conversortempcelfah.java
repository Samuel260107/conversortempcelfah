import java.util.Scanner;

public class Conversortempcelfah {
	public static void main(String[] args) {
		//Pedro
		//Declaração de variáveis
		Double fah, cel, op;
		
		//Criação e instância do objeto de entrada
		Scanner entrada = new Scanner(System.in);

        do{ 

            System.out.println("\n\t\t\t -- Calculadora Cel e Fah --\n");
            System.out.println("1. Cel para Fah");
            System.out.println("2. Fah to Cel");
            System.out.println("3. Sair");
        if(op == 1){
                System.out.println("\n\t\t\t -- Soma --\n");

                //Entrada
                System.out.println("Informe Cel: ");
                cel = entrada.nextDouble();

                //Processamento
                fah = 9*cel/5 + 32;

                //Saida
                System.out.printf("%d = %d", cel, fah);
            }else if (op == 2){
                System.out.println("\n\t\t\t -- Subtração --\n");

                //Entrada
                System.out.println("Informe Fah: ");
                fah = entrada.nextDouble();

                //Processamento
                fah = 9*cel/5 + 32;

                //Saida
                System.out.printf("%d = %d", fah, cel);
            }else if (op == 3){
                System.out.println("Forte abraço!");
            }else{
                System.out.println("Opção" + op + " incorreta!");
            }
            

        }
}
}