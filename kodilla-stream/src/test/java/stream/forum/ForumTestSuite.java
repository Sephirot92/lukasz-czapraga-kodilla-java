package stream.forum;

import com.kodilla.stream.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testGetLocationOnFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("Alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanread", "Ethan Read", "Miami");
        ForumUser user3 = new ForumUser("eRik", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("niceole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Brianna Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert MacDonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user1222211", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user10
        user2.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relation for user9
        user9.addFriend(user3);

        //Then
        //user1 has 3 friends with following locations:
        //   user3:  "Key West"
        //   user7:  "Washington"
        //   user10: "Miami"
        Assert.assertEquals(3, user1.getLocationOfFriends().size());
        Assert.assertTrue(user1.getLocationOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationOfFriends().contains("Orlando"));
    }

    @Test
    public void testGetLocationsOfFriendsOfFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("Alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanread", "Ethan Read", "Miami");
        ForumUser user3 = new ForumUser("eRik", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("niceole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Brianna Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert MacDonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user1222211", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);

        //Then
        //user1 has 3 friends with following friends and their locations:
        //   user3:  user1: - should be skipped ("this" in context of user1)
        //           user7: "Washington"
        //           user2: "Miami"
        //           user9: "Washington" - duplicated, should be skipped
        //   user7:  user1: - should be skipped ("this" in context of user1)
        //           user3: "Key West"
        //   user10: user1: - should be skipped ("this" in context of user1)
        Assert.assertEquals(3, user1.getLocationOfFriends().size());
        Assert.assertTrue(user1.getLocationOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationOfFriends().contains("Orlando"));

    }
}