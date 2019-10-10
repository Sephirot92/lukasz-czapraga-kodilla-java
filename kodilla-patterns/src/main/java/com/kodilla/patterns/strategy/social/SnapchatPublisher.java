package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublishare {
    @Override
    public String share() {
        return "Snapchat";
    }
}
