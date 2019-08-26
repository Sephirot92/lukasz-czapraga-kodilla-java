package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdverbialPlace extends Adverbial {
    @Override
    public String generate() {
        List<String> words = new ArrayList<>();

        words.add("w morzu");
        words.add("w powietrzu");
        words.add("na ziemi");
        words.add("na boisku");
        words.add("na korcie");
        words.add("na promenadzie");
        words.add("w domu");
        words.add("na altance");

        AdverbialPlace adverbialPlace = new AdverbialPlace();

        return adverbialPlace.getRandomPart(words);

    }
    public String getRandomPart(List<String> words){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

}
