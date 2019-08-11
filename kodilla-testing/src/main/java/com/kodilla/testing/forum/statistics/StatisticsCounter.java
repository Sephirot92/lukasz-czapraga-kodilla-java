package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCounter implements Statistics{
    protected int numberOfUsers;
    protected int numberOfPosts;
    protected int numberOfComments;
    protected double avgPostPerUser;
    protected double avgCommentsPerUser;
    protected double avgCommentsPerPost;


    @Override
    public List<String> userNames() {
        numberOfUsers = userNames().size();
        ArrayList<String> resultUserNames = new ArrayList<String>();
        for (int i = 0; i < userNames().size(); i++)
            resultUserNames.add(userNames().get(i));

        return resultUserNames;
    }
    @Override
    public int postCount() {
        ArrayList<Integer> resultNumberOfPosts = new ArrayList<>();
        for(int j=0; j <postCount(); j++) {
            resultNumberOfPosts.add(j);
        }
        return resultNumberOfPosts.size();
    }

    @Override
    public int commentsCount() {
        ArrayList<Integer> resultNumberOfComments = new ArrayList<>();
        for(int k =0; k < commentsCount(); k++){
            resultNumberOfComments.add(k);
        }
        return resultNumberOfComments.size();
    }

    public StatisticsCounter(int numberOfUsers, int numberOfPosts, int numberOfComments, double avgPostPerUser, double avgCommentsPerUser, double avgCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.avgPostPerUser = avgPostPerUser;
        this.avgCommentsPerUser = avgCommentsPerUser;
        this.avgCommentsPerPost = avgCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
    public void calculateAdwStatistics(){
        numberOfUsers = userNames().size();
        numberOfPosts = postCount();
        numberOfComments = commentsCount();
        avgPostPerUser = postCount() / userNames().size();
        avgCommentsPerUser = commentsCount() / userNames().size();
        avgCommentsPerPost = commentsCount() / postCount();
    }
    public void showStatistics(){
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Number of average comments per user: " + avgCommentsPerUser);
        System.out.println("Number of average comments per post: " + avgCommentsPerPost);
    }
}

