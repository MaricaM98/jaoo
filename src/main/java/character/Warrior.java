package character;

public class Warrior extends Character {
	
public Warrior(String name, String race) {
	super(name, race);
}

public static Warrior createNewWarrior (String name, String race) {
	System.out.println("Created " + race + " Warrior" + " character named " + name);
	return new Warrior(name, race);
}

public void doWarriorAction () {
	System.out.println(getName() + ": Swings sword");
}

@Override
public void doAction() {
	doWarriorAction();
}
}
