package com.taeu.designPattern.proxyPattern2;

public class ImageView implements Drawable {
    String imageUrl;

    public ImageView(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String draw() {
        return imageUrl + " 이미지를 그린다!";
    }
}
