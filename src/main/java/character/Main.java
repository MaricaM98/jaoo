package character;

public class Main {
	public static void main(String[] args) {
		Mage gale = Mage.createNewMage("Gale", "Human");
		System.out.println(gale.getName());
		gale.doAction();
		Character boo = Character.createnewCharacter("Boo", "Dwarf");
		boo.doAction();
		Warrior arthur = Warrior.createNewWarrior("Arthur", "Half-elf");
		arthur.doAction();
	}
}
