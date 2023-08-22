import java.io.*;

public class Test2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("source.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.write(100); // unicode value of 100 will be written to the file
		pw.print(100); //100 will be written
		
		pw.println();
		
		pw.print('a');
		pw.print(true);
		
		pw.flush();
		pw.close();
	}

}
