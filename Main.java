import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    String nome ;
	    String pedido;
	    int nota = 5 ;
	    int opcao ;
	    do{
	    System.out.println("Digite seu nome: ");   
	    nome = scanner.nextLine();
	    
	     System.out.println("***Menu***");
	     System.out.println("Pedir Coxinha de Frango");
         System.out.println("Pedir cachorro quente");
	     System.out.println("Pedir enroladinho");
	     System.out.println("Pedir risole");
	     System.out.println("Encerrar");
	     opcao = scanner.nextInt();
	     
	    switch (opcao) {
	            
	        case 1:
	            pedido = "coxinha de frango";
	            System.out.println("Você pediu " + pedido );
	            break;
	        case 2:
	            pedido = "cachorro quente";
	            System.out.println("Você pediu " + pedido );
	            break;
	        case 3:
	            pedido = "enroladinho";
	            System.out.println("Você pediu " + pedido );
	            break;
	        case 4:
	            pedido = "risole";
	            System.out.println("Você pediu " + pedido );
	        default:
	        System.out.println("Opção inválida!");
	        
	  System.out.println("Avalie nosso atendimento");
	  if (nota == 5) {
     System.out.println("Obrigado pela sua avaliação");
	     nota = scanner.nextInt();
	  }
	 if (nota >= 1 && nota <= 4) {
                System.out.println("Avalie nosso atendimento de 1 a 5:");
                nota = scanner.nextInt();

                if (nota >= 1 && nota <= 5) {
                    System.out.println("Obrigado pela sua avaliação!");
                } else {
                    System.out.println("Nota inválida. A avaliação deve ser de 1 a 5.");
                }
	 }
	  }
	  }while(opcao != 0);
	   System.out.println("Obrigado pela preferência");
}

     }
