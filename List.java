package meuProjeto;



import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ListaEncadeada lista = new ListaEncadeada(); 
		
		int op; 
		
		do {
			mostraMenu();
			op = sc.nextInt(); 
			
			switch (op) {
			case 1: {
				System.out.println("Digite o nome do Cantor e cidade");
				Cantor cantor = new Cantor(); 
			    sc.nextLine();
			    cantor.setNome(sc.nextLine());
			    cantor.setCidade(sc.nextLine());
			    cantor.setId(sc.next());
			    lista.adicionar(cantor);
			    break; 
			}
			
			case 2: {
				System.out.println(lista.toString());
				break; 
			}
			
			case 3: {
				lista.remover();
				
				break; 
			}
			
			case 4: {
				System.out.println("Fim do programa");
				
				break; 
			}
			default:
				throw new IllegalArgumentException("Opção inválida: " + op);
			}	
		
		}while (op != 4); 
		
		sc.close();
	}
	
	public static void mostraMenu() {
		System.out.println("1 - Inserir nome, cidade e ID");
		System.out.println("2 - Mostrar lista");
		System.out.println("3 - Remover cantor");
		System.out.println("4 - Sair");
	}

}

