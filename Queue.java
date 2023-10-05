/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class Queue extends GenericLinkedList<GenericNode<?>>{
	public boolean enqueue(GenericNode<?> aGenericNode) {
		super.addGenericNode(aGenericNode);
		return false;
	}//end enqueue
	
	public GenericNode<?> dequeue(){
		if(super.isEmpty()) {
			return null;
		}
		GenericNode<?> temp = super.head;
		super.head = temp.getNextGenericNode();
		super.length--;
		return(temp);
	}
	
	public String getQueue() {
		StringBuilder sb = new StringBuilder("================Queue================");
		GenericNode<?> currentNode = super.getList();
		for(int n = 0; n < super.length+1; n++) {
			sb.append("\nQueue[" + n + "]:" + currentNode.data.toString());
			currentNode = currentNode.nextGenericNode;
		}
		sb.append("\n=====================================\n");
		return(sb.toString());
	}
}//end Queue.java
