/**
	
	Main driver for project 1. Builds a Pokedex from an input file, displays all Pokemon, displays the average height weight and experience,
	displays the Tallest and smallest, and lists all Pokemon with experience greater than 200.
	
	@author Jeremy Billow

**/
import java.io.File;

public class PokemonDriver {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("usage: java PokemonDriver <filename>");
			System.exit(1);
		}

		String inputFile = args[0];
		
		PokedexBuilder builder = new PokedexBuilder();

		Pokedex pokemons = builder.buildPokedex(inputFile);

		if(pokemons == null) {
			System.out.println("Sorry, Pokedex could not be built.");
			System.exit(1);
		}

		System.out.println("\nAll Pokemon: ");
		System.out.println(pokemons.toString());

		System.out.printf("Average height: %4.1f \n", pokemons.averageHeight());
		System.out.printf("Average weight: %4.1f \n", pokemons.averageWeight());
		System.out.printf("Average experience: %4.1f \n", pokemons.averageExperience());
		System.out.printf("Species of Tallest: %s \n", pokemons.tallest());
		System.out.printf("Species of Smallest: %s \n", pokemons.smallest());
		System.out.println("Pokemon with experience greater than 200: ");
		for(Pokemon pokemon: pokemons.mostExperienced(200)) {
			System.out.println(pokemon.toString());
		}


	}
	
}