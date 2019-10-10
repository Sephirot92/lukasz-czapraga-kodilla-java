package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublishare socialPublishare;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String publish() {
        return socialPublishare.share();
    }

    public void setPublishingSocialMedia(SocialPublishare socialPublishare) {
        this.socialPublishare = socialPublishare;
    }
}
