package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class StatisticsCalculator {

    private double averageNumberOfPosts;
    private double averageNumberOfComments;
    private double averageNumberOfCommentsPerPost;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.postsCount() > 0) {
            averageNumberOfPosts = (double) statistics.usersNames().size() / statistics.postsCount();
        }
        if (statistics.commentsCount() > 0) {
            averageNumberOfComments = (double) statistics.usersNames().size() / statistics.commentsCount();
        }
        if (statistics.postsCount() > 0) {
            averageNumberOfCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
    }

    public String showStatistics() {
        return "[" + numberOfUsers + "," + numberOfPosts + "," + numberOfComments + "," +  averageNumberOfPosts + "," + averageNumberOfComments + "," + averageNumberOfCommentsPerPost + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticsCalculator that = (StatisticsCalculator) o;
        return Double.compare(that.averageNumberOfPosts, averageNumberOfPosts) == 0 &&
                Double.compare(that.averageNumberOfComments, averageNumberOfComments) == 0 &&
                Double.compare(that.averageNumberOfCommentsPerPost, averageNumberOfCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageNumberOfPosts, averageNumberOfComments, averageNumberOfCommentsPerPost);
    }

    @Override
    public String toString() {
        return "averageNumberOfPosts = " + averageNumberOfPosts +
                ", averageNumberOfComments = " + averageNumberOfComments +
                ", averageNumberOfCommentsPerPost = " + averageNumberOfCommentsPerPost;
    }
}


