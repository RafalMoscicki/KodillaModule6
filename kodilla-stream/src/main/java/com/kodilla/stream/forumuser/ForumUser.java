package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postNumber;

    public ForumUser(int userId, String user, char sex, LocalDate dateOfBirth, int postNumber) {
        this.userId = userId;
        this.name = user;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postNumber = postNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", user='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postNumber=" + postNumber +
                '}';
    }
}
