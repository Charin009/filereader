package filereader;

/**
 * Find running time of runnable object.
 * @author Charin Tantrakul
 *
 */
public class TaskTimer {
	private Stopwatch sw = null;
	
	public TaskTimer() {
		sw = new Stopwatch();
	}
	
	/**
	 * Find running time of any Runnable
	 * @param task is any Runnable that you want to find running time
	 */
	public void runAndCompute(Runnable task) {
		sw.start();
		task.run();
		System.out.println(task.toString());
		sw.stop();
		System.out.printf("Total time of task : %.6f\n",sw.getElapsed());
	}
}
