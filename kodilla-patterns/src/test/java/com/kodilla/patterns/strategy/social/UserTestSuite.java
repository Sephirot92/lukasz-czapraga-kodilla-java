package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User joe = new Millenials("Joe Banks");
        User zeta = new ZGeneration("Zigfried Denelese");
        User bryan = new YGeneration("Bryan O'Connor");

        //When
        String joeIsPublishing = joe.socialPublishare.share();
        System.out.println("Joe is publishing via " + joeIsPublishing);
        String zetaIsPublishing = zeta.socialPublishare.share();
        System.out.println("Zeta is publishing via " + zetaIsPublishing);
        String bryanIsPublishing = bryan.socialPublishare.share();
        System.out.println("Bryan is publishing via " + bryanIsPublishing);

        //Then
        Assert.assertEquals("Snapchat", joeIsPublishing);
        Assert.assertEquals("Facebook", bryanIsPublishing);
        Assert.assertEquals("Twitter", zetaIsPublishing);
    }

    @Test
    public void testIndyvidualSharingStrategies() {
        //Given
        User joe = new Millenials("Joe Banks");

        //When
        String joeIsPublishingOn = joe.socialPublishare.share();
        System.out.println("Joe is publishing via " + joeIsPublishingOn);
        joe.setPublishingSocialMedia(new TwitterPublisher());
        String joeIsPublishingOnNow = joe.socialPublishare.share();
        System.out.println("Now Joe is publishing via " + joeIsPublishingOnNow);
        //Then
        Assert.assertNotEquals(joeIsPublishingOn, joeIsPublishingOnNow);

    }
}
