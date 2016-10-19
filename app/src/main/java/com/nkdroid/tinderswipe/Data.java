package com.nkdroid.tinderswipe;

/**
 * Created by nirav on 05/10/15.
 */
public class Data {

    private String description;

    private String imagePath;

    private int image;

    public Data(String imagePath, String description) {
        this.imagePath = imagePath;
        this.description = description;
    }

    public Data(int image, String description) {
        this.image = image;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getImage() {
        return image;
    }

}
