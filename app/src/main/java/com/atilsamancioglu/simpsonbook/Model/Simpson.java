package com.atilsamancioglu.simpsonbook.Model;

import java.io.Serializable;

public class Simpson implements Serializable {

    private String name;
    private String job;
    private int pictureInteger;

    public Simpson(String name, String job, int pictureInteger) {
        this.name = name;
        this.job = job;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
