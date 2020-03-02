package TransactionApplication;

import java.util.logging.*;

public class Stage1 implements Runnable {
	
    public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private QueueImplementation queueImplementation;
    
    public Stage1(QueueImplementation queueImplementation) {
        this.queueImplementation = queueImplementation;
    }

	@Override
	public void run() {
        // get data from input queue of queueImplementation
        // Process it
        // put it into the output queue of queueImplementation
		LOGGER.log(Level.INFO, "Stage 1 completed");
    }
    
    public QueueImplementation getQueueImplementation() {
        return queueImplementation;
    }
}
