package exercise1;

class Person {

	private String name ;
	private int age ;
	// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	// Créez des getters publics pour lire ces valeurs une fois la classe construite.
	public String getName () {
		return name;
	}
	public int getAge () {
		return age;
	}
}
