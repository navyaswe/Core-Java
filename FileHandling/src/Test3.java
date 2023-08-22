import java.io.*;

public class Test3 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		String result = br.readLine();
		
		while(result!=null) {
			boolean avail = false;
			BufferedReader br1 = new BufferedReader(new FileReader("delete.txt"));
			
			String line = br1.readLine();
			while(line!=null) {
				if(line.equals(result)) {
					avail = true;
					break;
				}
				line = br1.readLine();
			}
			
			if(avail == false) {
				pw.println(result);
				pw.flush();
			}
			result = br.readLine();
		}
		
		br.close();
		pw.close();
	}

}
