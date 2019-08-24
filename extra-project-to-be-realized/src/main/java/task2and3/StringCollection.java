package task2and3;

public class StringCollection {
    Element collectionHead = null;

    public Element getElement (int n){
        if (n == 0){
            return collectionHead;
        }else{
            Element temp = collectionHead.getNext();
            for(int s = 1; s == n ; s++) {
                temp = temp.getNext();
            }
            return temp;
        }
    }
    public void addElement (String s){
        Element element = new Element(s);
        if(collectionHead == null){     //Tutaj jest if sprawdzający, czy koekcja posiada pierwszy element czy też.
            collectionHead = element;   //przypisanie element do collectionHead.
        }else{
            Element temp = collectionHead;     // Tutaj tworzę obiekt temp typu Element, do któego przywiązuję collectionHead.
            while (temp.getNext() != null){     //Tworzę pętlę while, gdzie wskazuję jej, że ma działać tak długo, jak temp.getNExt() jest pusty.
                temp = temp.getNext();          // do obiektu temp przywiązuję temp.getNext
            }
            temp.setNext(element);              //korzystam z settera. Ustawiam element
            element.setPrev(temp);              // tutaj tempa ustawiam jako poprzedni.
        }
    }
    boolean removeElement(String s){
        if(collectionHead.equals(s)){
            collectionHead = collectionHead.getNext();
            return true;
        }else if (collectionHead.getNext().equals(s)){
            collectionHead.setPrev(collectionHead);
            return true;
        }else{
            return false;
        }
    }
}
