package TransactionApplication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataSource {

	public BlockingQueue<Message> messageQueue = new LinkedBlockingQueue<>();
	public Message message;
	
	public DataSource() {
		createMessageObjects();
	}

	private void createMessageObjects() {
		message = new Message("1","Hardik","Shaunak","1000");		
		addMessageToQueue(message);
		message = new Message("2","Shaunak","Dhananjay","2000");		
		addMessageToQueue(message);
		message = new Message("3","Dhananjay","Chirag","3000");		
		addMessageToQueue(message);
		message = new Message("4","Chirag","Juhi","4000");		
		addMessageToQueue(message);
		message = new Message("5","Juhi","Hardik","5000");		
		addMessageToQueue(message);
		
	}

	private void addMessageToQueue(Message message) {
//		System.out.println("message from data source    " + message);
		messageQueue.add(message);
	}

	public BlockingQueue<Message> getMessageQueue() {
		return messageQueue;
	}
	
	
}
