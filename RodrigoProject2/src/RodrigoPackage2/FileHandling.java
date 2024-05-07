package RodrigoPackage2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	public void readDatabyChar() throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileReader fr = new FileReader(f);		
		int a;
		while( (a=fr.read()) != -1) {
			System.out.println(a + " -> " + (char)a);
		}
	}
	
	public void readDatabyLine() throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while( (s=b.readLine()) != null ) {
			System.out.println(s);
		}
	}
	
	public void writeData() throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileWriter fw = new FileWriter(f);	// (f, true) to append data.
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("1st line....");
		bw.newLine();
		bw.write("2nd line....");
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		FileHandling f = new FileHandling();
//		f.readDatabyChar();
//		f.readDatabyLine();
		f.writeData();
	}
}
