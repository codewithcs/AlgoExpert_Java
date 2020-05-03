package AlgoExpert_Medium;
import java.util.ArrayList ;
import java.util.List; 

public class BreadthFirstSearch {

	static class Node {
	    String name;
	    List<Node> children = new ArrayList<Node>();

	    public Node(String name) {
	      this.name = name;
	    }

	    public List<String> breadthFirstSearch(List<String> array) { // bfs starting at this node. 
	      // Write your code here.
	      return null;
	    }

	    public Node addChild(String name) {
	      Node child = new Node(name);
	      children.add(child);
	      return this;
	    }
	  }
	
}
