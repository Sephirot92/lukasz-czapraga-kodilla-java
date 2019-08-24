package task2and3;

public class Element {
    private String value;
    Element next = null;
    Element prev = null;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Element{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        return value.equals(element.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
