package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublishare {
    @Override
    public String share() {
        return "Twitter";
    }
}
