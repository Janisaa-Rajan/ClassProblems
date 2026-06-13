package com.example.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class writefile {

	public static void main(String[] args) throws IOException {
		FileWriter write = new FileWriter("sample.txt", false);
	    write.write("HelloWorld\n");
		write.write("First Java \n");
		write.close();
		

	}

}
