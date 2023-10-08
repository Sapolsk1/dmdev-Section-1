package com.dmdev.cs.homework5.task2;

import com.dmdev.cs.homework5.task2.Chat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Chat> chats = getChats();

        List<User> userMore18YearAge = new ArrayList<>();
        List<User> userLess18YearAge = new ArrayList<>();


        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            Chat next = iterator.next();
            List<User> nextUsers = next.getUsers();
            Iterator<User> userIterator = nextUsers.iterator();
            while (userIterator.hasNext()) {
                User nextUser = userIterator.next();
                if (nextUser.getAge() > 18) {
                    userMore18YearAge.add(nextUser);
                } else {
                    userLess18YearAge.add(nextUser);
                }
            }
        }
        System.out.println(userMore18YearAge);

        Iterator<User> userIterator = userLess18YearAge.iterator();
        int age = 0;
        while (userIterator.hasNext()) {
            age += userIterator.next().getAge();
        }
        int averageAge = age / userLess18YearAge.size();
        System.out.println(averageAge);
    }

    private static List<Chat> getChats() {
        User user = new User(1, "Павел", 17);
        User user1 = new User(2, "Иван", 18);
        User user2 = new User(3, "Николай", 19);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        Chat chat = new Chat("Учеба", users);

        User user3 = new User(4, "Игорь", 20);
        User user4 = new User(5, "Вадим", 15);
        User user5 = new User(6, "Михаил", 30);
        List<User> users1 = new ArrayList<>();
        users1.add(user3);
        users1.add(user4);
        users1.add(user5);
        Chat chat1 = new Chat("Работа", users1);

        User user6 = new User(6, "Алексей", 17);
        User user7 = new User(7, "Виктор", 38);
        User user8 = new User(8, "Сергей", 29);
        List<User> users2 = new ArrayList<>();
        users.add(user6);
        users.add(user7);
        users.add(user8);
        Chat chat2 = new Chat("Друзья", users2);

        List<Chat> chats = new ArrayList<>();
        chats.add(chat);
        chats.add(chat1);
        chats.add(chat2);
        return chats;
    }
}
