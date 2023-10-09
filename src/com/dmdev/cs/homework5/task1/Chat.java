package com.dmdev.cs.homework5.task1;

import java.util.Objects;

public class Chat implements Comparable<Chat> {

    private String name;
    private Integer users;

    public Chat(String name, Integer users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(name, chat.name) && Objects.equals(users, chat.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }
}
