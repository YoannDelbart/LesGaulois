package Scenario;

import personnages.*;

public class Histoire {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Gaulois Obelix = new Gaulois("Ob�lix", 10);
		Gaulois Asterix = new Gaulois("Ast�rix", 8);
		Romain Minus = new Romain("Mnius", 27);
				
		Panoramix.parler("Je vais aller pr�parer une petite potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par B�l�nos, ce n'est pas juste !");
		Asterix.boirePotion(6);
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}

}
