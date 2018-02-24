package filereader;
/**
 * Test TaskTimer and any Task class.
 * @author Charin Tantrakul
 *
 */
public class Main {

		public static void main(String[] args) {
			TaskTimer timer = new TaskTimer();
			AppendStringTask task1 = new AppendStringTask("/Users/kaizofaria/Documents/workspace/filereader/src/Alice-in-Wonderland.txt");
			AppendStringBuilderTask task2 = new AppendStringBuilderTask("/Users/kaizofaria/Documents/workspace/filereader/src/Alice-in-Wonderland.txt");
			AppendStringUsingBufferedReaderTask task3 = new AppendStringUsingBufferedReaderTask("/Users/kaizofaria/Documents/workspace/filereader/src/Alice-in-Wonderland.txt");
			timer.runAndCompute(task1);
			timer.runAndCompute(task2);
			timer.runAndCompute(task3);
		}
}
