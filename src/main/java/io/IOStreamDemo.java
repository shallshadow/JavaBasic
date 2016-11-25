/**
 * @author shadow
 * @Date 2016年8月13日下午8:39:16
 * @Fun
 **/
package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;

public class IOStreamDemo {
	public static void main(String[] args) throws IOException {

		//String s2 = readByLine();
		// readByStanardInput();
		// inputFromMemory(s2);
		// inputFormatMemory(s2);
		//outputFile(s2);
		//StoreAndRecover();
		writeRandomAccessFile();
		readRandomAccessFile();

	}

	public static void readRandomAccessFile() throws IOException{
		RandomAccessFile file = new RandomAccessFile("rtest.txt", "rw");
		for(int i = 0; i < 10; i++){
			System.out.println("Value " + i + " : " + file.readDouble());
		}
		file.close();
	}
	
	public static void writeRandomAccessFile() throws IOException{
		RandomAccessFile rFile = new RandomAccessFile("rtest.txt", "rw");
		for(int i = 0; i < 10; i++){
			rFile.writeDouble(i * 1.414);
		}
		rFile.close();
		
		rFile = new RandomAccessFile("rtest.txt", "rw");
		rFile.seek(5*8);
		rFile.writeDouble(47.0001);
		rFile.close();
	}
	
	public static void StoreAndRecover() throws IOException {
		DataOutputStream outputStream = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("Data.txt")));
		
		outputStream.writeDouble(3.1415);
		outputStream.writeChars("That was pi\n");
		outputStream.writeBytes("That was pi\n");
		outputStream.close();
		
		DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println(inputStream.readDouble());
		
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		reader.close();
		inputStream.close();
		
	}

	public static void outputFile(String s2) throws IOException {
		BufferedReader reader = new BufferedReader(new StringReader(s2));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("IODemo.out")));
		int lineCount = 1;
		String s = null;
		while ((s = reader.readLine()) != null) {
			writer.println(lineCount + " : " + s);
			lineCount++;
		}
		reader.close();
		writer.close();
	}

	/**
	 * Formatted memory input
	 * 
	 * @param s2
	 * @throws IOException
	 */
	public static void inputFormatMemory(String s2) throws IOException {
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(s2.getBytes()));

		while (true) {
			System.out.println((char) inputStream.readByte());
		}
	}

	public static void inputFromMemory(String s2) throws IOException {
		StringReader reader = new StringReader(s2);
		int c;
		while ((c = reader.read()) != -1) {
			System.out.print((char) c);
		}
	}

	public static String readByLine() throws IOException {
		BufferedReader in = new BufferedReader(
				new FileReader("src" + File.separator + "io" + File.separator + "IOStreamDemo.java"));
		String s, s2 = new String();
		while ((s = in.readLine()) != null) {
			s2 += s + "\n";
		}
		in.close();
		return s2;
	}

	public static void readByStanardInput() throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line:");
		System.out.println(stdin.readLine());
	}

}
