package com.example.chatup;

public class notification {
    int profile;
    String name , name2;

    public notification(int profile, String name, String name2) {
        this.profile = profile;
        this.name = name;
        this.name2 = name2;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
