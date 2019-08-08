package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
    public void addPost(String author, String postBody){
        // do nothing
    }
    public void addComment(ForumPost thePost, String author, String commentBody){
        //do nothing
    }
    public int getPostQuantity(){
        //temporary return 100
        return 100;
    }
    public int getCommentQuantity(){
        //temporary return 100
        return 100;
    }
    public ForumPost getPost(int postNumber){
        //return null- operation unsuccessful;
        return null;
    }
    public ForumComment getComment(int commentNumber){
        //return null- operation unsuccessful;
        return null;
    }
    public boolean removePost(ForumPost thePost){
        //for now - return true
        return true;
    }
    public String getName() {
        return name;
    }
    public String getRealName() {
        return realName;
    }
}
