

class PopulationProjection
{
	public static void main(String[] args) {

		int secondInDay = 60*60*24;

		int birthPerDay = secondInDay/7;          // 1 birth In 7 sec
		System.out.println("Birth Per Day : " + birthPerDay);

		int birthPerYear = birthPerDay * 365;
		System.out.println("Birth Per Year : " + birthPerYear);
		System.out.println("");

		int deathPerDay = secondInDay/13;        //1 Death In 13 sec
		System.out.println("Death Per Day : " + deathPerDay);

		int DeathPerYear = deathPerDay* 365;
		System.out.println("Death Per Year : " + DeathPerYear);
		System.out.println("");

		int immigrantPerDay = secondInDay/45 ;    //1 immigrant In 45 seconds
		System.out.println("Immhigrant Per Day : " + immigrantPerDay);

		int immigrantPerYear = immigrantPerDay *365;
		System.out.println("Immigrant Per Year : " + immigrantPerYear);
		System.out.println("");


		int populationInYear = birthPerYear - DeathPerYear - immigrantPerYear;
		System.out.println("population in one Year : " + populationInYear);
		int currentPopulation = 312032486;
		int totalPopulation = currentPopulation +  5*populationInYear;

		System.out.println("Total Population after the 5 Years is " + totalPopulation);

	}
}