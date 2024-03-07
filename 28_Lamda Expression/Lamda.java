interface Inter{


	int addition (int num1, int num2);
}

class Lamda
{
	public static void main(String[] args) {
		Inter obj =(num1,num2)->num1+num2;
		System.out.println(obj.addition(5,4));

		// Inter obj = new Inter(){
		// 	public int addition(int num1,int num2)
		// };
		// System.out.println(obj.addition(5,4));
	}
}