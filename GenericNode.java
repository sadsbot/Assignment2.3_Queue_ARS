/**
* A generic node to hold any object as a data type.
*
* @author aross-sermons
* @author njohnson3
* @version 1.0
* CS215; Lab #0.2
* Fall 2023
*/

class GenericNode<T> {
	T data;
	GenericNode<?> nextGenericNode;
	/**
	 * Default Constructor
	 */
	public GenericNode()
	{
		nextGenericNode=null;
		data=null;
	}//end
	/**
	 * @param data the data to be set
	 */
	public void setData(T data) {
		this.data=data;
	}//end
	/**
	 * @return the GenericNode
	 */
	public GenericNode<T> getGenericNode() {
		return this;
	}//end
	/**
	 * @param nextGenericNode the nextGenericNode to be set
	 */
	public void setNextGenericNode(GenericNode<?> nextGenericNode)
	{
		this.nextGenericNode=nextGenericNode;
	}//end
}//end GenericNode.java
