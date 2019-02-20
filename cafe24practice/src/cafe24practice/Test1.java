package cafe24practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		while(true){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
			System.out.println("leap year");
			
		} else {
			System.out.println("common year");
			break;
		}
		}
	}

}
