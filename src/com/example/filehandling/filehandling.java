package com.example.filehandling;

import java.io.File;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) throws IOException {
		File f = new File ("sample.txt");
		if (!f.exists())
		{
			if(f.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File not created");
			}
		}
		else {
			System.out.println("File already exists");
			f.delete();
		}
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		

	}

}
