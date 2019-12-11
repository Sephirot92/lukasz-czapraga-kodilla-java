package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, Object> theResultForum = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBorn().getYear() >= 20)
                .filter(forumUser -> forumUser.getPublicatedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserUniqueNumber, forumUser -> forumUser));

        System.out.println("# Elements :" + theResultForum.size());
        theResultForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        /*BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBook = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()> 2005)
                .map(Book::toString)
                .collect(Collectors.joining("\n", "<<", ">>"));

        System.out.println(theResultStringOfBook);*/

/*        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book ::getSignature, book -> book));

        System.out.println("#elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expression with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);

        System.out.println("Calculting expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::substractAFromB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier beatufiedText = new PoemBeautifier();

        System.out.println("\n Time to have fun with POemBeatufier");
        beatufiedText.textToBeautify("NaNaNaNaNa", ((toBeBeatufied) -> "Banananana"+ toBeBeatufied));
        beatufiedText.textToBeautify("SHAZAAAAAAM!!!",((toBeBeatufied) -> ("Wait, what..." + toBeBeatufied)));
        beatufiedText.textToBeautify("ba", ((toBeBeatufied) -> toBeBeatufied + "na" + "na" + "!!!!!!"));
        beatufiedText.textToBeautify("shazam...!", ((toBeBeatufied) -> (toBeBeatufied).toUpperCase()));
        beatufiedText.textToBeautify(" SO MUCH SPACE ", ((toBeBeatufied) -> (toBeBeatufied).toLowerCase() + "Chief"));

        System.out.println("Using stream to generate even numbers from 1 to 100");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') +2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);


        BookDirectory bookDirectory = new BookDirectory();
        bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements :" + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);
    */
    }

}