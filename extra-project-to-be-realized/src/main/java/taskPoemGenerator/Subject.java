package taskPoemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject extends SentencePart {
    @Override
    public String generate() {
        List<String> words = new ArrayList<>();

        words.add("Kot");
        words.add("Mops");
        words.add("Pies");
        words.add("Rower");
        words.add("Miriam");
        words.add("Margaret");
        words.add("Lucas");
        words.add("Andrzej");
        words.add("Darek");
        words.add("Samochód");
        words.add("Paradygmat");
        words.add("Wiocha");
        words.add("Pajda");
        words.add("Piekło");
        words.add("Mors");;
        words.add("Vega");
        words.add("Toyota");
        words.add("Honda");
        words.add("Mitsubishi");
        words.add("Lexus");

        Subject subject = new Subject();

        return subject.getRandomPart(words);

    }
    public String getRandomPart(List<String> words){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
