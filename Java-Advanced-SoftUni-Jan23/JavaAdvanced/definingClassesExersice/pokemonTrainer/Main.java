package JavaAdvanced.definingClassesExersice.pokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> namesSet = new LinkedHashSet<>();
        List<Trainer> trainerList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String[] parts = input.split("\\s+");
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String pokemonElement = parts[2];
            int pokemonHealth = Integer.parseInt(parts[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            if (!namesSet.contains(trainerName)) {
                namesSet.add(trainerName);
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainerList.add(trainer);
            } else {
                for (Trainer trainer : trainerList) {
                    if (trainer.getName().equals(trainerName)) {
                        trainer.addPokemon(pokemon);
                    }
                }
            }
            input = scanner.nextLine();
        }

        String element = scanner.nextLine();
        while (!element.equals("End")) {
            for (Trainer trainer : trainerList) {
                if (trainer.getPokemonListSize() > 0) {
                    if (trainer.containsPokemonElement(element)) {
                        trainer.addBadge();
                    } else {
                        trainer.loseHealth();
                    }
                }
            }
            element = scanner.nextLine();
        }

        trainerList.sort(Comparator.comparing(Trainer::getBadges).reversed());
        trainerList.forEach(System.out::println);
    }
}
