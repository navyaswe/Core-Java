import java.io.*;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;  
		while((line=br.readLine())!=null) {
			System.out.println(line);
			line = br.readLine();
			
		}
		br.close();
		
	}

	}
