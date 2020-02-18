package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Adam", 'M', LocalDate.of(1990, 12, 31), 10));
        userList.add(new ForumUser(001, "Liz", 'F', LocalDate.of(1991, 10, 12), 32));
        userList.add(new ForumUser(001, "Pixel", 'M', LocalDate.of(2018, 11, 11), 100));
        userList.add(new ForumUser(001, "Kim", 'F', LocalDate.of(1999, 1, 5), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
