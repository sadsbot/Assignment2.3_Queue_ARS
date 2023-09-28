/**
* A generic linked list to hold generic nodes of any data type.
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #0.2
* Fall 2023
*/

public class GenericLinkedList<T> {
	GenericNode<?> head;
	int length;
	GenericNode<?> tail;
	/**
	 * Default Constructor
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end
	/**
	 * Returns true if the GenericLinkedList is empty and false if it is not.
	 *
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end
	/**
	 * @return the head
	 */
	public GenericNode<?> getList()
	{
		return head;
	}//end
	/**
	 * @param aGenericNode the GenericNode to add
	 */
	public void addGenericNode(GenericNode<?> aGenericNode)
	{
		if (isEmpty() ) {
			head = aGenericNode;
			tail=head;
			return;
		}
		tail.nextGenericNode=aGenericNode;
		tail=(GenericNode<?>) tail.nextGenericNode;
		tail.nextGenericNode=null;
		length++;
	}//end
}//end GenericLinkedList.java
