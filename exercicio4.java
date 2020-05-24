package EstRepeticao;
	import java.util.Scanner;
		public class exercicio4{
				public static void main(String[]Args) {
				
					
					Scanner leitor = new Scanner(System.in);
					int contagem = 1, maior = 0;
					int valor;
					
				        
				    System.out.println("Digite 15 numeros: ");
				    
				    do {
				    System.out.printf("%d° numero:",contagem);
				        valor = leitor.nextInt();
				        	++contagem; 
				        
				    if (valor > maior) {
				    maior = valor;
				    }
				    
				             
				    }while (contagem <= 15);
				   
				
				    System.out.println("\nMaior valor: " + maior);		
				
	}
}
