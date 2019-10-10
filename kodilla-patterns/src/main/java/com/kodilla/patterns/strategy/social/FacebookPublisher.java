package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublishare {
    @Override
    public String share() {
        return "Facebook";
    }
}
