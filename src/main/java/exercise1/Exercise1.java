package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		Person a=new Person (name, age);
		return a ;

	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		Person person = new Person (name, age);
		System.out.println("person :" + person.getName()+","+person.getAge());
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
	}
}
