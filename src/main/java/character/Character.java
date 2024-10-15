package character;

public class Character {
private String name;
protected String race;

public Character(String name, String race) {
	this.name = name;
	this.race = race;
}
public static Character createnewCharacter (String name, String race) {
System.out.println("Created " + race + " " + " character named " + name );
return new Character(name, race);
}

public void doAction() {
	System.out.println(name + ": Generic Action");
}

public String getName() {
	return name;
}
}

