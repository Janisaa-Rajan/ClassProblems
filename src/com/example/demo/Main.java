package com.example.demo;

/*public class Main {

	public static void main(String[] args) {
		int result = Calculation.display();
		System.out.println(result);

	}
	}*/
/*import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter element");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		System.out.println("Result:" +sum);
	}
	
}*/

/*import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowsize = sc.nextInt();
		int colsize = sc.nextInt();
		int[][] arr=new int[rowsize][colsize];
		
		for(int row=0; i<rowsize; row++)
		{
			for(int col=0; j<colsize;col++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int row=0; i<rowsize; row++)
		{
			for(int col=0; j<colsize;col++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}

*/

/*public class Main {
	public static void main(String[] args) {
		String s = new String("Java");
		System.out.println(s.length());
		System.out.println(s.charAt(1));
	}
}*/

/*s Main{
	public static void main(String[]args) {
		String s = "Education";
		s= s.toLowerCase;
				int count=0;
				for(int i = 0; i< s.length(); i++) {
				char ch = s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					count++;
				}
	}
				System.out.println("Vowel count" +count);
	}
	}*/


/*
public class Main {
	public static void main(String[] args) {
		String str = "Education";
	String result = "";
	for(int i = str.length-1; i>=0; i--) {
	result = str.CharAt();
			}
	System.out.println(result);
	}
}
*/


/*
public class Main {
	public static void main(String[] args) {
		str = "Java is a Program " ;
		String[] word = str.split("");
		System.out.println(word.length);
	}
}


*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        if (reverse == xcopy) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}







