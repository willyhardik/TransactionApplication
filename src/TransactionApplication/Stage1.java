package TransactionApplication;

import org.apache.log4j.Logger;

public class Stage1 implements Runnable {
	
	public final static Logger log = Logger.getLogger(Stage1.class.getName());
	   
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// fetch data from queue validate it
		// put it in the next queue
		LOGGER.log(Level.INFO, "Stage 1 completed");
	}

}
