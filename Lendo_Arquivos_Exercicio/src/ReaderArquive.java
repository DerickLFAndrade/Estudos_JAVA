import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderArquive {
	private String path;
	
	public ReaderArquive(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void readerArchive() {
		try(BufferedReader file = new BufferedReader(new FileReader(path))) {
		 String line = file.readLine();
		 while(line != null) {
			 System.out.println(line);
		 }
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
