package JavaAdvanced.definingClassesExersice.pokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public String getName() {
        return name;
    }

    public boolean containsPokemonElement(String pokemonElement) {
        for (Pokemon pokemon : this.pokemonList) {
            if (pokemon.getElement().equals(pokemonElement)) {
                return true;
            }
        }
        return false;
    }

    public void addBadge() {
        this.badges++;
    }

    public void loseHealth() {
        List<Pokemon> toRemove = new ArrayList<>();
        for (Pokemon pokemon : this.pokemonList) {
            pokemon.decreaseHealth();
            if (pokemon.getHealth() <= 0) {
                toRemove.add(pokemon);
            }
        }
        if (toRemove.size() > 0)
            this.pokemonList.removeAll(toRemove);
    }

    public int getPokemonListSize() {
        return pokemonList.size();
    }

    public int getBadges() {
        return badges;
    }

    @Override
    public String toString() {
        return name + " " + badges + " " + pokemonList.size();
    }
}
