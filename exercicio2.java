package EstRepeticao;
	import java.util.Scanner;
		public class exercicio2{
				public static void main(String[]Args) {
				
					
		Scanner leitor = new Scanner(System.in);
		int numero = 1;
		int digitado;
				        
		System.out.print("Digite um numero: ");
		digitado = leitor.nextInt();
		
			while ( numero <= digitado ){
			System.out.println(numero+"\n");
			numero++;

		}
	}
}