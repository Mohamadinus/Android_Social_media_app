package com.example.chatup;

public class models {
    int imageView1 , profile_image;
    String name;

    public models(int imageView1, int profile_image, String name) {
        this.imageView1 = imageView1;
        this.profile_image = profile_image;
        this.name = name;
    }

    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
