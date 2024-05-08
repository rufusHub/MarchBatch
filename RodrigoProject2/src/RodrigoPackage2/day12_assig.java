package RodrigoPackage2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class day12_assig {
	
	public void ReadData(int x) throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		int cont = 1;
		while( (s=b.readLine()) != null ) {
			if (cont == x) {
				System.out.println(s);
				break;
			}
			++cont;
		}
	}
	
	public void ReadDataofRange(int x, int y) throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		int cont = 1;
		while( (s=b.readLine()) != null ) {
			if (cont >= x && cont <= y) {
				System.out.println(s);
			}
			++cont;
		}
	}	
	
	public void WriteData(int x) throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i=1; i<=x; ++i) {
			System.out.println("Enter you text, line " + i + ": ");
			Scanner s = new Scanner(System.in);
			String st = s.nextLine();
			bw.write(st);	
			bw.newLine();
		}
		bw.close();
		System.out.println("This is the end, check the file.");
	}
	
	public void WriteDataInRange(int x, int y) throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i=1; i<=y; ++i) {
			System.out.println("Enter you text, line " + i + ": ");
			Scanner s = new Scanner(System.in);
			String st = s.nextLine();
			if(i == x) {
				bw.write(st);	
				bw.newLine();
				++x;
			}
		}
		bw.close();
		System.out.println("This is the end, check the file.");
	}
	
	public void copyPaste() throws IOException {
		File f = new File("../RodrigoProject2/myfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		File f2 = new File("../RodrigoProject2/myfileNew.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		while( (s=br.readLine()) != null ) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		day12_assig f = new day12_assig();
//		f.ReadData(1);
//		f.ReadDataofRange(3, 7);
//		f.WriteData(5);
//		f.WriteDataInRange(2, 7);
		f.copyPaste();
	}
}
