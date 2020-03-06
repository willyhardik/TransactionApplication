package TransactionApplication;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Stage1 implements Runnable {
	   
    private QueueImplementation queueImplementation;
//    private static Logger log = Logger.getLogger(Stage1.class.getName());
    static private Logger logger = Logger.getLogger(Stage1.class);

    public Stage1(QueueImplementation queueImplementation) {
        this.queueImplementation = queueImplementation;
    }

	@Override
	public void run() {
		try {
//			PropertyConfigurator.configure("log4j.properties");

			while(queueImplementation.getInputQueue().remainingCapacity() > 0) {
				Message message = queueImplementation.getInputQueue().take();
//				System.out.println("Message from stage 1   " + message);	
				logger.debug("Message:" + message.getMessageId() + " has started stage 1   " + message);
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
