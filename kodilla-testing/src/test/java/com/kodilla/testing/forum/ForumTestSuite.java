package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("test case: begin");
    }
    @After
    public void after() {
        System.out.println("test case: end");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("test suite: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("test suite: begin");
    }

    @Test
    public void testCaseUsername() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();
        System.out.println("testing " + result);

        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getRealName();
        System.out.println("testing " + result);

        Assert.assertEquals("John Smith", result);
    }
}
