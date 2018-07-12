
public class indice {
	Node[] index;
	public indice(int tamanho, encadeada lista) {
		this.index = new Node[tamanho];
		Node temp = lista.getHead();
		index[0] = temp;
		for(int i = 1 ; i < tamanho ; i++) {
			index[i] = index[i-1].getNext();
		}
	}
	
	public String pegardata(int posicao) {
		return index[posicao].data; 
		
	}
}