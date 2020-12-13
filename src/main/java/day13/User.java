package day13;

import day12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFriend(User user) {
        if (subscriptions.contains(user) && user.getSubscriptions().contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text){
        Message ms = new Message(this, user, text);
        MessageDatabase.messages.add(ms);
    }

    public String toString(){
        return username;
    }

    //getters
    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
