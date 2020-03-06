package TransactionApplication;

import org.apache.log4j.Logger;

public class Stage4 implements Runnable {

    private QueueImplementation queueImplementation;
    static private Logger logger = Logger.getLogger(Stage4.class);

   
    public Stage4(QueueImplementation queueImplementation) {
        this.queueImplementation = queueImplementation;
    }

	@Override
	public void run() {
		try {
			while(queueImplementation.getInputQueue().remainingCapacity() > 0) {
				Message message = queueImplementation.getInputQueue().take();
//				System.out.println("Message from stage 4   " + message);	
				logger.debug("Message:" + message.getMessageId() + " has started stage 4   " + message);
				queueImplementation.addToOutputQueue(message);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// get data from input queue of queueImplementation
        // Process it
        // put it into the output queue of queueImplementation
    }
    
    public QueueImplementation getQueueImplementation() {
        return queueImplementation;
    }
}
