package cafe24practice;

public class study6 {
	
	public static String methods(int init, int limit){
		int i = init;
		String output = "";
		while(i < limit){
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = methods(1,5);
		System.out.println(result);
	}

}
