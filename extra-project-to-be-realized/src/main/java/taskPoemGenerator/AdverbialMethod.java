package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdverbialMethod extends Adverbial {
    @Override
    public String generate() {
        List<String> words = new ArrayList<>();

        words.add("wyzywająco");
        words.add("chętnie");
        words.add("starannie");
        words.add("mocno");
        words.add("słabo");
        words.add("byle jak");
        words.add("niechętnie");
        words.add("potulnie");


        AdverbialMethod adverbialMethod= new AdverbialMethod();

        return adverbialMethod.getRandomPart(words);

    }
    public String getRandomPart(List<String> words){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

}
