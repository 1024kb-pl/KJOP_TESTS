package service;

public class UserService {
    String [] users;

    public UserService(String [] users) {
        this.users = users;
    }

    public boolean isUserExist(String login) {
        for(String user : users) {
            if (user.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public int getUsersCount() {
        return users.length;
    }

    public int getCountRepeatsByLogin(String login) {
        int countRepeats = 0;
        for(String user : users) {
            if (user.equals(login)) {
                countRepeats++;
            }
        }
        return countRepeats;
    }
}
