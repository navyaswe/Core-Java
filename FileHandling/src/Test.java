import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException{
		File f = new File("source.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
		f.mkdir();
		System.out.println(f.exists());
		
		File f1 = new File("gvkchb", "sample.txt");
		File f2 = new File(f1,"sample.txt");
		
		FileWriter fw = new FileWriter("source.txt");
		fw.write(10);
		fw.write("Java");
		char ch[] = {'p','r','o','g','r','a','m'};
		fw.write(ch);
		
		fw.flush();
		
		
		FileReader fr = new FileReader("sample.txt");
		int i = fr.read();
		while(i!=1) {
			System.out.println((char)i);
			i=fr.read();
		}
		
		

	}

}
