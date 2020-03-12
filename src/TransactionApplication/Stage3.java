package TransactionApplication;

import org.apache.log4j.Logger;

public class Stage3 implements Runnable {

    private QueueImplementation queueImplementation;
    static private Logger logger = Logger.getLogger(Stage3.class);

    public Stage3(QueueImplementation queueImplementation) {
        this.queueImplementation = queueImplementation;
    }

	@Override
	public void run() {
		try {
			while(queueImplementation.getInputQueue().remainingCapacity() > 0) {
				Message message = queueImplementation.getInputQueue().take();
//				System.out.println("Message from stage 3   " + message);	
				if(message.amount > 0) {
					logger.debug("Message:" + message.getMessageId() + " has completed stage 3   " + message);
					queueImplementation.addToOutputQueue(message);
				}
				else {
					logger.debug("Message:" + message.getMessageId() + " has been terminated at stage 3   " + message);
				}
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
