package com.example.filehandling;

public class MainTable {

	public static void main(String[] args) {
		Thread t1 = new Thread1(2);
        Thread2 t2 = new Thread2(4);
        t1.start();
        t2.start();
	}

}
