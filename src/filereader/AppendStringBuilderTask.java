package filereader;
import java.io.*;

/**
 * Read a file then append string by StringBuilder. .
 * @author Charin Tantrakul
 *
 */
public class AppendStringBuilderTask implements Runnable {
	private String filename = "";
	private double size;
	
	public AppendStringBuilderTask(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		StringBuilder data = new StringBuilder();
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
		
		InputStreamReader reader = new InputStreamReader(in);
		
		int c;
		while( true )	{
			c = reader.read();
			if(c < 0) break;
			data = data.append((char)c);
		}
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(in != null) try{
			in.close();
		} catch (IOException ex){
			System.out.println(ex.getMessage());
		}
		size = data.length();
	}
	
	@Override
	public String toString() {		
		return "Read file 1-char at a time to String.\nContain : "+size+" chars";
	}

}
