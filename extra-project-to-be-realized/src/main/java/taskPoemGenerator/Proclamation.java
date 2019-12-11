package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Proclamation extends SentencePart {
    @Override
    public String generate() {
        List<String> words = new ArrayList<>();

        words.add("śpi");
        words.add("pije");
        words.add("macha");
        words.add("nurkuje");
        words.add("biegnie");
        words.add("gra");
        words.add("chleje");
        words.add("strzela");
        words.add("rzuca");
        words.add("podaje");
        words.add("ślizga się");
        words.add("spieszy się");
        words.add("liże");
        words.add("połyka");
        words.add("obiecuje");
        ;
        words.add("oddaje");
        words.add("myje się");
        words.add("bierze");
        words.add("poddaje się");
        words.add("myśli");

        Proclamation proclamation = new Proclamation();

        return proclamation.getRandomPart(words);

    }

    public String getRandomPart(List<String> words) {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

}
