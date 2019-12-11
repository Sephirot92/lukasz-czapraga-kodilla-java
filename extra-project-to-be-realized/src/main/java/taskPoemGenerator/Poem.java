package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poem {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Proclamation proclamation = new Proclamation();
        Adverbial adverbial = new Adverbial();

        for (int j = 0; j < 20; j++) {
            String adverbialTime = new AdverbialTime().generate();
            String adverbialMethod = new AdverbialMethod().generate();
            String adverbialPlace = new AdverbialPlace().generate();

            Random randoms = new Random();

            List<String> adverbials = new ArrayList<>();
            adverbials.add(adverbialTime);
            adverbials.add(adverbialMethod);
            adverbials.add(adverbialPlace);

            Random randomVerseGenerator = new Random();

            for (int i = 0; i < randomVerseGenerator.nextInt(10); i++) {
                Sentence sentence = new Sentence(subject.generate(), proclamation.generate(), adverbials.get(randoms.nextInt(adverbials.size())));

                System.out.println(sentence);
                System.out.println();
            }

        }


    }
}
