package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdverbialTime extends Adverbial {
    @Override
    public String generate() {
        List<String> words = new ArrayList<>();

        words.add("wczoraj");
        words.add("dzisiaj");
        words.add("jutro");
        words.add("pojutrze");
        words.add("przedwczoraj");
        words.add("za miesiąc");
        words.add("za rok");
        words.add("nigdy");


        AdverbialTime adverbialTime = new AdverbialTime();

        return adverbialTime.getRandomPart(words);

    }
    public String getRandomPart(List<String> words){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
