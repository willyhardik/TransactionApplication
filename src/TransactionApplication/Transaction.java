package TransactionApplication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Transaction {

	public static void main(String[] args) {
		/*
		 * there will be 4 listeners each of them listening from their respective queue
		 * once an item arrives in queue a thread of the respective thread will be runned
		 * 
		 * */
        
        final int MAX_QUEUE_SIZE = 10;
        // Get input data to application from DataSource class here
        BlockingQueue<Message> inputMessages = new LinkedBlockingQueue<>();
        Stage1 stage1 = new Stage1(new QueueImplementation(inputMessages, new LinkedBlockingQueue<>(),
                                     MAX_QUEUE_SIZE));
        Stage2 stage2 = new Stage2(new QueueImplementation(stage1.getQueueImplementation().getOutputQueue(), new LinkedBlockingQueue<>(),
                                     MAX_QUEUE_SIZE));
        Stage3 stage3 = new Stage3(new QueueImplementation(stage2.getQueueImplementation().getOutputQueue(), new LinkedBlockingQueue<>(),
                                     MAX_QUEUE_SIZE));
        Stage4 stage4 = new Stage4(new QueueImplementation(stage3.getQueueImplementation().getOutputQueue(), new LinkedBlockingQueue<>(),
                                     MAX_QUEUE_SIZE));
        
        // Initialize the threads
        Thread stage1Thread = new Thread(stage1);
        Thread stage2Thread = new Thread(stage2);
        Thread stage3Thread = new Thread(stage3);
        Thread stage4Thread = new Thread(stage4);

        // Start the threads
        stage1Thread.start();
        stage2Thread.start();
        stage3Thread.start();
        stage4Thread.start();
    }
}
