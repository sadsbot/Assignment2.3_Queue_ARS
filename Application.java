/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

import java.util.Scanner;

public class Application {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Queue myQueue = new Queue();
		
		Scanner sysin = new Scanner(System.in);
		boolean exit = false;
		String nextCmd;
		System.out.println("Type \"help\" for a list of commands.");
		while(!exit) {
			System.out.print("\nEnter next command: ");
			nextCmd = sysin.next();
			if(nextCmd.contains("help")) {
				System.out.println("help - view all commands"
				+ "\nexit - close the program"
				+ "\nenq - enqueue the following string"
				+ "\ndeq - dequeue and return the first string"
				+ "\nlist - list all elements of the queue");
			}else if(nextCmd.contains("exit")) {
				exit = true;
			}else if(nextCmd.contains("enq")) {
				System.out.print("\nEnter the String you would like to enqueue: ");
				nextCmd = sysin.next();
				GenericNode<String> newNode = new GenericNode<String>();
				newNode.setData(nextCmd);
				System.out.println("Queued new node with data: " + newNode.data.toString());
				myQueue.enqueue(newNode);
			}else if(nextCmd.contains("deq")) {
				System.out.println("Dequeued: " + myQueue.dequeue().data.toString());
			}else if(nextCmd.contains("list")) {
				System.out.print(myQueue.getQueue());
			}else System.out.println("Command not recognized. Type \"help\" for a list of commands.");
		}//end loop
	}//end main

}//end Application.java
