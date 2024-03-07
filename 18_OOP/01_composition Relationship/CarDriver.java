class CarDriver
{
	public static void main(String[] args) {
		Car a = new Car("Audi","Q8",new Engine(4,340,"v6"));
		a.displayCar();
		a.engine.displayEngine();
	}
}