package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(101, "JohnRatnicky", 'm', 2001, 12, 10, 15));
        forumUsersList.add(new ForumUser(102, "MonikaRokicky", 'f', 1998, 10, 13, 0));
        forumUsersList.add(new ForumUser(103, "DarrylJ", 'm', 1998, 11, 12, 10));
        forumUsersList.add(new ForumUser(104, "Montolivo", 'm', 2005, 10, 1, 15));
        forumUsersList.add(new ForumUser(105, "VladimirP", 'm', 1965, 2, 3, 1352));
        forumUsersList.add(new ForumUser(106, "Margaret", 'f', 1996, 2, 13, 1526));
        forumUsersList.add(new ForumUser(107, "Paulinho", 'm', 2005, 6, 10, 125));
        forumUsersList.add(new ForumUser(108, "Corni", 'f', 1998, 10, 13, 256));
        forumUsersList.add(new ForumUser(109, "Jonataninho", 'm', 1994, 4, 12, 639));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }
}

/*

private final List<Book> theBookList = new ArrayList<>();
    public BookDirectory(){
        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "0005"));
        theBookList.add(new Book("Madelynn Carson", "Unity without duty", 2007, "0006"));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007"));
    }
    public List<Book> getList(){
        return new ArrayList<>(theBookList);
    }

 */