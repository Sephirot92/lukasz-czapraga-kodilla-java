package taskPoemGenerator;

public class Sentence {
    private String subject;
    private String proclamation;
    private String adverbial;

    public Sentence(String subject, String proclamation, String adverbial) {
        this.subject = subject;
        this.proclamation = proclamation;
        this.adverbial = adverbial;
    }

    public String getSubject() {
        return subject;
    }

    public String getProclamation() {
        return proclamation;
    }

    public String getAdverbial() {
        return adverbial;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "subject='" + subject + '\'' +
                ", proclamation='" + proclamation + '\'' +
                ", adverbial='" + adverbial + '\'' +
                '}';
    }

}

