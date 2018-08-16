package service;

import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testGetUserCountNormal() {
        String [] users = {"Kamil", "Pablo"};
        UserService userService = new UserService(users);

        final int result = userService.getUsersCount();

        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetUserCountZero() {
        String [] users = {};
        UserService userService = new UserService(users);

        final int result = userService.getUsersCount();

        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountRepeatsUserWithRepeats() {
        String [] users = {"Pablo", "Kamil", "Pablo"};
        UserService userService = new UserService(users);

        final int result = userService.getCountRepeatsByLogin("Pablo");

        Assert.assertEquals(2, result);
    }

    @Test
    public void testCountRepeatsUserWithoutRepeats() {
        String [] users = {"Pablo", "Kamil", "Pablo"};
        UserService userService = new UserService(users);

        final int result = userService.getCountRepeatsByLogin("Angela");

        Assert.assertEquals(0, result);
    }

    @Test
    public void testIsUserExistWhenUserExist() {
        String [] users = {"Pablo", "Kamil", "Pablo"};
        UserService userService = new UserService(users);

        final boolean result = userService.isUserExist("Kamil");

        Assert.assertTrue(result);
    }

    @Test
    public void testIsUserExistWhenUserNoExist() {
        String [] users = {"Pablo", "Kamil", "Pablo"};
        UserService userService = new UserService(users);

        final boolean result = userService.isUserExist("Angela");

        Assert.assertFalse(result);
    }


}
