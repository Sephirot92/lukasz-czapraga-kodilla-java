package task2and3;

public class StringCollectionRunner {
    public static void main (String [] args) {
        StringCollection stringCollection = new StringCollection();

        stringCollection.addElement("Meow");
        stringCollection.addElement("Hau");

        String check = String.valueOf(stringCollection.getElement(1));
        String check1 = String.valueOf(stringCollection.getElement(2));

        System.out.println(check);

    }

}
