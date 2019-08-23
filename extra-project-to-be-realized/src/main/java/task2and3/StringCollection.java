package task2and3;

public class StringCollection {
    Element collectionHead = null;

    public Element getElement (int n){
        for(int s = 0; s <= n ;s++ ){
            collectionHead.getNext();
        }
        return new Element(collectionHead.getValue());
    }
    public void addElement (String s){
        Element element = new Element(s);
        if(collectionHead == null){
            collectionHead = element;
        }else{
            collectionHead.setNext(element);
            element.setPrev(element);
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
