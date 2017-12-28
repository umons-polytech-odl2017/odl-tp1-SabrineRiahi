package exercise2;

class Person {

	private int age;
	private static int PopulationSize = 0 ;
	private static float sumAge = 0 ;


	public Person (int age) {
		PopulationSize += 1 ;
		this.age = age ;
		sumAge += age ;
	}

	public static int computePopulationSize (){
		return PopulationSize;
	}

	public static float computeAveragePopulationAge () {
		return sumAge/PopulationSize ;
	}

	public static void resetPopulation () {
		sumAge = 0 ;
		PopulationSize = 0 ;
	}
}
