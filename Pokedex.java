/**

		class Pokedex takes Pokemon objects and adds them to the Pokedex. toString formats each object as a string for output.
		averageWeight, averageHeight, and averageExperince calculate respective averages accross all Pokemon in the Pokedex.
		tellest and smallest find and return the species of the tallest and least heavy Pokemon respectively.
		largest is used to find the largest weight for comparison in smallest.
		mostExperienced finds all Pokemon with experience greater than a passed int argument and adds them to an ArrayList.

		@author Jeremy Billow

**/
import java.util.ArrayList;

public class Pokedex {

	private ArrayList<Pokemon> pokemons;

	public Pokedex() {
		this.pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon) {
		this.pokemons.add(pokemon);
	}

	public String toString() {
		String returnString = "";
		for(Pokemon pokemon: this.pokemons) {
			returnString = returnString + pokemon.toString() + "\n";
		}
		return returnString;
	}

	public double averageHeight() {
		double total = 0;
		for(Pokemon pokemon: this.pokemons) {
			total = total + pokemon.getHeight();
		}
		double result = total / this.pokemons.size();

		return result;
	}

	public double averageWeight() {
		double total = 0;
		for(Pokemon pokemon: this.pokemons) {
			total = total + pokemon.getWeight();
		}
		double result = total / this.pokemons.size();

		return result;
	}

	public double averageExperience() {
		double total = 0;
		for(Pokemon pokemon: this.pokemons) {
			total = total + pokemon.getExperience();
		}
		double result = total / this.pokemons.size();

		return result;
	}

	public String tallest() {
		int max = 0;
		int indexMax = 0;
		int i = 0;
		for(Pokemon pokemon: this.pokemons) {
			if(this.pokemons.get(i).getHeight() >= max) {
				max = this.pokemons.get(i).getHeight();
				indexMax = i;
			}
			i++;
		}
		return this.pokemons.get(indexMax).getName();
		
	}

	public int largest() {
		int max = 0;
		for(Pokemon pokemon: this.pokemons) {
			if(pokemon.getWeight() >= max) {
				max = pokemon.getWeight();
			}
		}
		return max;
	}

	public String smallest() {
		int min = largest();
		int indexMin = 0;
		int i = 0;
		for(Pokemon pokemon: this.pokemons) {
			if(pokemon.getWeight() <= min) {
				min = pokemon.getWeight();
				indexMin = i;
			}
			i++;
		}
		return this.pokemons.get(indexMin).getName();
	}

	public ArrayList<Pokemon> mostExperienced(int level) {
		ArrayList<Pokemon> mostExperienced = new ArrayList<Pokemon>();
		for(Pokemon pokemon: this.pokemons) {
			if(pokemon.getExperience() > level) {
				mostExperienced.add(pokemon);
			}
		}
		return mostExperienced;
	}


}