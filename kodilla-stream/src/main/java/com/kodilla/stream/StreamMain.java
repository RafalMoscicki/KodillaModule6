package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> collect = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter(forumUser -> forumUser.getPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        collect.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
