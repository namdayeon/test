package cafe24practice;

import java.util.Scanner;
//369 게임 짝 출력, 사각형 만드는데 상속, 오버라이딩을 
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ss = 0, cnt = 0; //소수인지 판별, 소수의 개수
		
		for(int i = 2; i < a; i++){
			for(int j = 2; j < i; j++){
				if(i % j==0){
					ss++;
				}
			}
			if(ss==0){
				System.out.print(i + " ");
				cnt++;
			}
			ss = 0;
		}
		System.out.println();
		System.out.println("소수의개수" + cnt);
		
		sc.close();
		
	}

}
