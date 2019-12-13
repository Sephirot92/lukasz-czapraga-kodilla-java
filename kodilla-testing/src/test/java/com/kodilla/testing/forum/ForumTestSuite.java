package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;


public class ForumTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begins");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: End.");
    }

    @Before
    public void before() {
        System.out.println("Test has just begun");
    }

    @After
    public void after() {
        System.out.println("Test Case: End");
    }

    @Test
    public void testCaseUsername() {
        //Arrange
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //act
        String result = simpleUser.getUsername();
        // assert
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        //Arrange
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //act
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //assert
        Assert.assertEquals("John Smith", result);
    }
}
