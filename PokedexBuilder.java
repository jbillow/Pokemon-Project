/**
		
		class PokedexBuilder reads in info from an input file passes as an argument, creates new Pokemon objects, 
		adds each object to the Pokedex, and returns the complete Pokedex.

		@author Jeremy Billow

**/
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class PokedexBuilder {

	public Pokedex buildPokedex(String filename) {

		Pokedex pokemons = new Pokedex();

		File inputFile = new File(filename);

		try(Scanner input = new Scanner(inputFile)) {

			input.useDelimiter(",|\n");
			input.nextLine();
			while(input.hasNext()) {
				int id = input.nextInt();
				String name = input.next();
				int sid = input.nextInt();
				int height = input.nextInt();
				int weight = input.nextInt();
				int experience = input.nextInt();
				int order = input.nextInt();
				int isDefault = input.nextInt();

				Pokemon pokemon = new Pokemon(name, height, weight, experience);
				pokemons.addPokemon(pokemon);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		return pokemons;
	}
}