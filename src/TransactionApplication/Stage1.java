package TransactionApplication;

import java.util.logging.*;

public class Stage1 implements Runnable {
	
	public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// fetch data from queue validate it
		// put it in the next queue
		LOGGER.log(Level.INFO, "Stage 1 completed");
	}

}
