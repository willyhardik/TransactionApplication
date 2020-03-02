package TransactionApplication;

import java.util.concurrent.BlockingQueue;

public class QueueImplementation {

    private BlockingQueue<Message> inputQueue;
    private BlockingQueue<Message> outputQueue;
    private int outputQueueSize;

    public QueueImplementation(BlockingQueue<Message> inputQueue, BlockingQueue<Message> outputQueue, 
                                int outputQueueSize) {
        this.inputQueue = inputQueue;
        this.outputQueue = outputQueue;
        this.outputQueueSize = outputQueueSize;
    }

    public Message readFromInputQueue() throws InterruptedException {
        return inputQueue.take();
    }

    public void addToOutputQueue(Message message) throws InterruptedException {
        outputQueue.put(message);
    }

    public BlockingQueue<Message> getInputQueue() {
        return inputQueue;
    }

    public BlockingQueue<Message> getOutputQueue() {
        return outputQueue;
    }

    public int getOutputQueueSize() {
        return outputQueueSize;
    }
}