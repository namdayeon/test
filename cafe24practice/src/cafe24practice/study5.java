package cafe24practice;

public class study5 {
	public static void arrays(){
		String[] name={"최보람","남다연","김홍목"};
		for(int a=0; a<name.length; a++){
			String names = name[a];
			System.out.println("이름은"+names+"입니다.");
		}
		
		for(String e : name){
			System.out.println("이름은"+e+"입니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays();
		arrays();
		arrays();
		

	}
	


}
