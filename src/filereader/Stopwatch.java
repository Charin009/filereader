package filereader;

/**
 * object that used in calculate the times  while doing something.
 * @author Charin Tantrakul
 *
 */
public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private boolean isRun ;
	private long startTime;
	private long stopTime;
	
	/**
	 * Constructor of Stopwatch and define isRun to false.
	 */
	public Stopwatch() {
		isRun = false;
	}
	
	/**
	 * Used to start timer 
     * startTime collected current time in nanosecond
     * if isRunnig() is true, start() will not work
	 */
	public void  start() {
		if(this.isRun == false) {
			startTime = System.nanoTime();
			isRun = true;
		}
		else return;
	}
	
	/**
	 * used to stop timer
	 * endTime collected current time in nanosecond
	 * if isRunnig() is false ,stop() will not work
	 */
	public void stop() {
		if(this.isRun == true) {
			stopTime = System.nanoTime();
			isRun = false;
		}
		else return;
	}
	
	/**
     * Check status of Stopwatch(Runnig or not)
     * @return true if Stopwatch are running at time
     */
	public boolean isRunning() {
		return isRun;
	}
	
	/**
	 * getElapsed will calculate elapsed between start and stop Stopwatch
	 * by endTime-startTime and convert to second by multiply with NANOSECONDS
	 * @return  elapsed between you start() and stop() Stopwatch.
	 */
	public double getElapsed() {
		if(isRun) {
			long currentTime = System.nanoTime();
			return (currentTime - startTime)*NANOSECONDS;
		}
		return (stopTime - startTime)*NANOSECONDS;
	}
}
