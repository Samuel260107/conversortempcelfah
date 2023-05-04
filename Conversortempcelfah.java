import java.util.Scanner;

public class Conversortempcelfah {
	public static void main(String[] args) {
		//Pedro
        //Samuel
		//Declaração de variáveis
		Double fah, cel, op;
		
		//Criação e instância do objeto de entrada
		Scanner entrada = new Scanner(System.in);

        do{ 

            System.out.println("\n\t\t\t -- Calculadora Cel e Fah --\n");
            System.out.println("1. Cel para Fah");
            System.out.println("2. Fah to Cel");
            System.out.println("3. Sair");

            //Opção do usuário
            System.out.print(" Opção: ");
            op = entrada.nextDouble();



        if(op == 1){
                System.out.println("\n\t\t\t -- Celsius para Fahrenheit --\n");

                //Entrada
                System.out.println("Informe Celsius: ");
                cel = entrada.nextDouble();

                //Processamento
                fah = 9*cel/5 + 32;

                //Saida
                System.out.println("\n\n" + "Cel: " + cel + "°C" + " = " + "Fah: " + fah + "°F" );
            }else if (op == 2){
                System.out.println("\n\t\t\t -- Fahrenheit --\n");

                //Entrada
                System.out.println("Informe Fahrenheit: ");
                fah = entrada.nextDouble();

                //Processamento
                cel = (fah - 32)*5/9;

                //Saida
                System.out.println("\n\n" + "Fah: " + fah + "°F" + " = " + "Cel: " + cel + "°C" );
            }else if (op == 3){
                System.out.println("Forte abraço!");
            }else{
                System.out.println("Opção" + op + " incorreta!");
            }
            

        }while(op!=3);
}
}