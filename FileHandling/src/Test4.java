import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("source.txt"));
		String data = br.readLine();
		String result = " ";
		int length = 0;
		
		while(data!=null) {
			int resLength = data.length();
			if(length<resLength) {
				length = resLength;
				result = data;
			}
			
			data = br.readLine();
		}
		System.out.println("Data in a file with maximum length:"+result);
		System.out.println("Maximum length of a String:"+length);
		
	}
}