package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public String forumUser() {
        return "John Smith";
    }
}

