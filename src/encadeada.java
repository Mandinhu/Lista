public class encadeada   {
	private Node head;
	private Node tail;
	private Node no;
	
	public encadeada() {
		this.head = null;
		this.tail = null;
	}
	
	public void insere(Node no) {
		if(this.head == null) {
			this.head = no;
			this.tail = no;
		}
		else{
			int inteirateste;
			Node temp;
			temp = head;
			boolean enquanto = true;
			while(enquanto) {
				 inteirateste = no.data.compareTo(temp.data);
				 if(inteirateste < 0 ) {
					 if(temp == head) {
						 this.head = no;
						 this.tail = temp;
						 head.setNext(temp);
						 tail.setPrevious(no);
						 enquanto = false;
					 }
					 
					 else {
						 temp.getPrevious().setNext(no);
						 no.setPrevious(temp.getPrevious());
						 temp.setPrevious(no);
						 no.setNext(temp);
						 enquanto = false;
					 }
				   //Entra antes 
				 }
				 
				 else {
					if(temp == tail ) {
						this.tail.setNext(no);
						no.setPrevious(this.tail);
						this.tail = no;
						enquanto = false;
						//Entra fim
					}
					else {
						temp = temp.getNext();
					}
				 }
			}
		} 
	}
	public Node procura(String data) {
		Node atual = this.head;
		while(true) {
			if(atual.data.equals(data) ) {
				return atual;
			}
			else
			{
				atual = atual.getNext();
				if(atual == null) {
					return null;
				}
			}
		}	
	}
	
	public boolean remove(String data) {
			Node  atual = null;
			atual = this.procura(data);
			if(atual != null) {
				Node  temp = atual.getPrevious();
				temp.setNext(atual.getNext());
				temp = atual.getNext();
				temp.setPrevious(atual.getPrevious());
				return true;
			}
			else {
				return false;
			}
	}
	
	public void lista() {
		Node temp = this.head;
		int i = 0;
		while(temp != null) {
			System.out.println(+i+": "+temp.data);
			temp = temp.getNext();
			i++;
		}
	}
	
	public Node getHead() {
		return this.head;
	}
}