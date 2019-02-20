package cafe24practice;

class Calculator{
	static double Pi=3.14;
	int left, right;
	
	public void setNumber(int left, int right){
		this.left=left;
		this.right=right;
	}
	
	public void sum(){
		System.out.println(this.left+this.right);
	}
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}


public class study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(); //클래스를 샤용(인스턴스)
		c1.setNumber(3,5);
		c1.sum();
		System.out.println(c1.Pi);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.Pi);

		System.out.println(Calculator.Pi);
	}

}
