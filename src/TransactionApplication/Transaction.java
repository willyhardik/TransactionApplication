package TransactionApplication;

public class Transaction {

	public static void main(String[] args) {
		/*
		 * there will be 4 listeners each of them listening from their respective queue
		 * once an item arrives in queue a thread of the respective thread will be runned
		 * 
		 * */
		
		Thread t1 = new Thread(new Stage1());
		t1.start();
	}
}
