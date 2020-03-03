package TransactionApplication;

public class Stage4 implements Runnable {

    private QueueImplementation queueImplementation;
    
    public Stage4(QueueImplementation queueImplementation) {
        this.queueImplementation = queueImplementation;
    }

	@Override
	public void run() {
		// get data from input queue of queueImplementation
        // Process it
        // put it into the output queue of queueImplementation
    }
    
    public QueueImplementation getQueueImplementation() {
        return queueImplementation;
    }
}
