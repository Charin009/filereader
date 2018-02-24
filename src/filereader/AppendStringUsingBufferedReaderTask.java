package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read file by BufferedReader then append string .
 * @author Charin Tantrakul
 *
 */
public class AppendStringUsingBufferedReaderTask implements Runnable {
	private String filename = "";
	private double size;
	
	public AppendStringUsingBufferedReaderTask(String filename) {
		this.filename = filename;
	}

	@Override
	public void run() {
		FileReader reader;
		BufferedReader br = null;
		String result = "";
		String line;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			
			while((line = br.readLine()) != null) {
				result = result + line + "\n" ;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if(br!= null) try{
			br.close();
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
		size = result.length();
	}
	
	@Override
	public String toString() {
		return "Read file line at a time using BufferedReader.\nContain : "+size+" chars";
	}
}
