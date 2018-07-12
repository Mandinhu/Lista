import java.util.*;

public class menu {
	encadeada lista;
	Scanner scanner;
	indice indexado;
	int index = 0;
	public void teste() {
		String meu = "\n";
		meu += "\nMenu";
		meu += "\n==========================";
		meu += "\n1- Cadastra Automovel";
		meu += "\n2- Lista Automoveis";
		meu += "\n3- Remove Automovel";
		meu += "\n4- Procura Automovel Por Nome";
		meu += "\n5- Procura Automovel Por Número";
		meu += "\n Escolha: ";
		while(true) {
			System.out.println(meu);
			switch(digita().charAt(0)) {
			case '1': cadastraautomovel();
			break;
			case '2': listaAutomoveis();
			break;
			case '3': removea();
			break;
			case '4': procuraa();
			break;
			case '5': listaindice();
			break;
			}
		}
	}
	private void listaindice() {
		System.out.println("Forneça o número/posição");
		int posicao = scanner.nextInt();
		if(posicao >= index) {
			System.out.println("Número não existe");
		}
		else {
			System.out.println(indexado.pegardata(posicao));
		}
	}
	private void removea() {
		System.out.println("Forneça o nome a ser removido:");
		String data = digita();
		if(lista.remove(data)) {
			System.out.println("Removido Com sucesso");
			index --;
			indexado = new indice(index, lista);
		}
		else {
		System.out.println("Não foi encontrado o nome.");
		}
	}
	public menu() {
		lista = new encadeada();
		scanner = new Scanner(System.in);
		}
	
	private void procuraa() {
		System.out.println("Forneça o nome do Automovel a ser procurado:");
		String data = digita();
		Node temp = lista.procura(data);
		if(temp == null) {
			System.out.println("ERRO nome não encontrado.");
		}
		else {
			System.out.println("Nome encontrado "+temp.data);		
			}
	}

	private  void listaAutomoveis() {
		lista.lista();

	}

	private String digita() {
		
		return scanner.next();
	}

	private void cadastraautomovel() {
		System.out.println("Forneça o nome do automovel:");
		String data = digita();
		Node no = new Node(data);
		lista.insere(no);
		index ++;
		indexado = new indice(index, lista);
	}
}