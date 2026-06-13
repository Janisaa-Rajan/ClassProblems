package com.example.filehandling;

public class Threadextension extends Thread {
	public void run() {
		for(int i = 1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ExampleThread t1 = new ExampleThread();package com.example.filehandling;

public class Threadextension extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Threadextension t1 = new Threadextension();
        Threadextension t2 = new Threadextension();

        t1.start();
        t2.start();
    }
}
		ExampleThread t2 = new ExampleThread();
		
		t1.start();
	
		t2.start();
	}

}