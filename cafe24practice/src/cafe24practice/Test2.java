package cafe24practice;

import java.util.Scanner;
//369 ���� ¦ ���, �簢�� ����µ� ���, �������̵��� 
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ss = 0, cnt = 0; //�Ҽ����� �Ǻ�, �Ҽ��� ����
		
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
		System.out.println("�Ҽ��ǰ���" + cnt);
		
		sc.close();
		
	}

}
