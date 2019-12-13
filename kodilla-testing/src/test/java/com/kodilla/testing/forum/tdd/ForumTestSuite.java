package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the begginign of the tests");

    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing test number " + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith", "Hello everyone! This is my very first contribution in here");

        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello Everyone, this is my first contribution in here!", "mrsmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for your warm welcome");
        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello Everyone!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello Everyone!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for warm welcome");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello Everyone!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello Everyone!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for your help!");

        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for your help");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuantity());
    }
}
