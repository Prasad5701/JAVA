class RandomNumber
{
	public static void main(String[] args) {
		
		double random = Math.floor(Math.random() * 10) % 6;
		System.out.println("Random Number is : " + random);
	}
}