package com.example.chatup;

public class DashBoard {
    int profile_image,bigImage,bookmark;
    String name1,name2,heart,comment,share;

    public DashBoard(int profile_image, int bigImage, int bookmark, String name1, String name2, String heart, String comment, String share) {
        this.profile_image = profile_image;
        this.bigImage = bigImage;
        this.bookmark = bookmark;
        this.name1 = name1;
        this.name2 = name2;
        this.heart = heart;
        this.comment = comment;
        this.share = share;
    }

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public int getBigImage() {
        return bigImage;
    }

    public void setBigImage(int bigImage) {
        this.bigImage = bigImage;
    }

    public int getBookmark() {
        return bookmark;
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
