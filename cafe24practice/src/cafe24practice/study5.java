package cafe24practice;

public class study5 {
	public static void arrays(){
		String[] name={"�ֺ���","���ٿ�","��ȫ��"};
		for(int a=0; a<name.length; a++){
			String names = name[a];
			System.out.println("�̸���"+names+"�Դϴ�.");
		}
		
		for(String e : name){
			System.out.println("�̸���"+e+"�Դϴ�");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays();
		arrays();
		arrays();
		

	}
	


}
