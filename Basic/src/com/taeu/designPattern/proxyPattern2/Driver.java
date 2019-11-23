package com.taeu.designPattern.proxyPattern2;

public class Driver {
    public static void main(String[] args) {
        Drawable imageView = new ImageView("이미지.닷컴.jpg");

        System.out.println(imageView.draw());

        imageView = new ProxyImageView("이미지.닷컴.jpg");
        System.out.println(imageView.draw());
    }
}
