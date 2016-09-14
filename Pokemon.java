/**
		
		class Pokemon builds Pokemon objects, formats them as a string for output, and implements
		get methods for each data member.

		@author Jeremy Billow

**/
public class Pokemon {
	
	private String name;
	private int height;
	private int weight;
	private int experience;
	private boolean isFavorite; 

	

	//constructor, sets isFavorite to default value false
	public Pokemon(String name, int height, int weight, int experience) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.experience = experience;
		this.isFavorite = false; 
	}

	//returns a formatted string with information about the Pokemon
	public String toString() {
		String starred;
		if(isFavorite){
			starred = "Starred.";
		} else {
			starred = "Not Starred.";
		}
		return this.name + "(" + this.height + ", " + this.weight + ") " + "With experience " + this.experience + " - " + starred;
	}

	//get methods
	public String getName() {
		return this.name;
	}

	public int getHeight() {
	 	return this.height;
	 }

	public int getWeight() {
		return this.weight;
	}

	public int getExperience() {
		return this.experience;
	}

	public boolean getFavorite() {
		return this.isFavorite;
	}
}

