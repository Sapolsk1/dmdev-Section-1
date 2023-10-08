package com.dmdev.cs.homework5.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Chat chat1 = new Chat("Учеба", 1001);
        Chat chat2 = new Chat("Работа", 2000);
        Chat chat3 = new Chat("Хобби", 999);
        Chat chat4 = new Chat("Семья", 5);
        Chat chat5 = new Chat("Друзья", 1500);
        Chat chat6 = new Chat("Язык Java", 1500);
        List<Chat> chats = new ArrayList<>(6);
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        chats.add(chat4);
        chats.add(chat5);
        chats.add(chat6);

        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            Chat next = iterator.next();
            if (next.getUsers() < 1000) {
                iterator.remove();
            }
        }

        Collections.sort(chats, new Comparator<Chat>() {
            @Override
            public int compare(Chat p1, Chat p2) {
                int compareUsers = p2.getUsers().compareTo(p1.getUsers());
                if (compareUsers == 0) {
                    return p1.getName().compareTo(p2.getName());
                }
                return compareUsers;
            }
        });
        System.out.println(chats);
    }
}
