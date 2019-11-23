package com.taeu.designPattern.proxyPattern2;

public class ProxyImageView implements Drawable {
    Drawable imageView;
    String imageUrl;

    public ProxyImageView(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    @Override
    public String draw() {
        if(imageView == null) {
            imageView = new ImageView(imageUrl);
        }

        System.out.println("이미지에 대한 모종의 처리!");
        return imageView.draw();
    }
}
