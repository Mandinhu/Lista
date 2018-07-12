

public class Node {
		  public String data;
		  private Node next;
		  private Node previous;
		  
		  public Node(String data) {
		    this.data = data;
		    this.setNext(null);
		    this.setPrevious(null);
		  }
		  
		  public Node(String data, Node prev ) {
			    this.data = data;
			    this.setNext(null);
			    this.setPrevious(prev);
		  }

		public Node getNext() {
			return next;
		}

		public void setNext(Node no) {
			this.next = no;
		}

		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}	  
}