package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static List<String> getList(){
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Both");
        theList.add("Corine Tilly");
        theList.add("Chloe Fry");
        theList.add("Martin Vaneluzela");
        return new ArrayList<String>(theList);
    }
}
