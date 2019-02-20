package cafe24practice;

import java.io.*;
import java.util.Scanner;

public class study9 {

	public static void main(String[] args) {
		File file = new File("out.txt");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}
}
