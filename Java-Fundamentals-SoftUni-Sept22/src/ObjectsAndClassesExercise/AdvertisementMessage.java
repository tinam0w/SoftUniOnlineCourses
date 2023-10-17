package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    static class RandomMessage{
        private String phrase;
        private String event;
        private String author;
        private String city;

        public RandomMessage(String phrase, String event, String author, String city){
            this.phrase = phrase;
            this.event = event;
            this.author = author;
            this.city = city;
        }

        @Override
        public String toString(){
            return this.phrase + " " + this.event + " " + this.author + " - " + this.city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] eventsArr = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authorsArr = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] citiesArr = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            Random rnd = new Random();
            int indexPhrases = rnd.nextInt(phrasesArr.length - 1);
            String phrase = phrasesArr[indexPhrases];
            int indexEvent = rnd.nextInt(eventsArr.length - 1);
            String event = eventsArr[indexEvent];
            int indexAuthor = rnd.nextInt(authorsArr.length - 1);
            String author = authorsArr[indexAuthor];
            int indexCities = rnd.nextInt(citiesArr.length - 1);
            String city = citiesArr[indexCities];
            RandomMessage randomMessage = new RandomMessage(phrase, event, author, city);
            System.out.println(randomMessage);
        }
    }
}