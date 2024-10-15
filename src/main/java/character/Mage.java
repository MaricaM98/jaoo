package character;

public class Mage extends Character {
public Mage (String name, String race) {
	super(name, race);
	}

public static Mage createNewMage(String name, String race) {
	System.out.println("Created " + race + " Mage" + " character named " + name);
	return new Mage(name, race);
}
public void doMageAction () {
	System.out.println(getName() + ": Casts Fireball");
	
}
@Override
public void doAction() {
	doMageAction();
}


}
