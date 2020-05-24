package EstRepeticao;
	import java.util.Scanner;
		public class exercicio3{
				public static void main(String[]Args) {
				

				Scanner leitor = new Scanner(System.in);
				int contagem = 1;
				int valor;
				int soma = 0 , media;
			        
			    System.out.println("Digite 20 numeros: ");
			    
			    do {
			    System.out.printf("%d° numero:",contagem);
			        valor = leitor.nextInt();
			        	++contagem; 
			        soma = soma + valor;
			    }
			             
			    while (contagem <= 20);
			    
			    media = soma /20;
			    System.out.println("\nSoma: " + soma);
			    System.out.println ("Media: "+ media);
					
					
	}
}