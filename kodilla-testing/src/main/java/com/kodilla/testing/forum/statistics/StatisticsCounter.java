package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCounter {
    int usersNumber;
    int postsNumber;
    int  commentsNumber;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;
    
    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    @Override
    public String toString() {
        return "StatisticsCounter{" +
                "usersNumber=" + usersNumber +
                ", postsNumber=" + postsNumber +
                ", commentsNumber=" + commentsNumber +
                ", avgPostsPerUser=" + avgPostsPerUser +
                ", avgCommentsPerUser=" + avgCommentsPerUser +
                ", avgCommentsPerPost=" + avgCommentsPerPost +
                '}';
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.userNames().size();
        postsNumber = statistics.postCount();
        commentsNumber = statistics.commentsCount();
        avgPostsPerUser = getPostsNumber()/(float)getUsersNumber();
        avgCommentsPerUser = getCommentsNumber()/(float)getUsersNumber();
        avgCommentsPerPost = getCommentsNumber()/(float)getPostsNumber();
    }
    public void showStatistics(){
        System.out.println("Total number of users is " + usersNumber);
        System.out.println("Total post number is " + postsNumber);
        System.out.println("Total comments number is " + commentsNumber);
        System.out.println("Average posts per User is " + avgPostsPerUser);
        System.out.println("Average comments per User is " + avgCommentsPerUser);
        System.out.println("Average comments per Post is " + avgCommentsPerPost);
    }
}
