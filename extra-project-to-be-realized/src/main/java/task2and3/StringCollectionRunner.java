package task2and3;

public class StringCollectionRunner {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();

        stringCollection.addElement("Meow");
        stringCollection.addElement("Hau");
        stringCollection.addElement("Pipi");

        stringCollection.removeElement("Hau");

        System.out.println(stringCollection.getElement(1));

        String check = String.valueOf(stringCollection.getElement(0));
        String check1 = String.valueOf(stringCollection.getElement(1));

        System.out.println(check);
        System.out.println(check1);
    }

}
