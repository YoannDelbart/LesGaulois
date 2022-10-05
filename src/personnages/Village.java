package personnages;

public class Village {
	private String nom;
	private Chef chef; 
	private Gaulois[] villageois;
	private int nbVillageois = 0; 
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom=nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef.getNom() + "vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+ villageois[i].getNom());
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {

		Village village = new Village("Village des irréductibles" , 30);

//		Gaulois gaulois = village.trouverHabitant(29);
// 		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//		Il y a 30 villageois donc c'est de 0 a 29 
		
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		
		Gaulois Asterix = new Gaulois("Astérix", 8);
		village.setChef(Abraracourcix);
		village.ajouterHabitant(Asterix);
		

//		 Gaulois gaulois = village.trouverHabitant(1); 
//		 System.out.println(gaulois); 
//		 null
// 		 il y a qu'un seul habitant dans le tableau donc c'est l'indice 0 pas 1		
		
		village.afficherVillageois();

	}
	
	 
	
}
  