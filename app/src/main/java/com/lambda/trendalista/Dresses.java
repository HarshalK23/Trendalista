package com.lambda.trendalista;

/**
 * Created by harshal on 11/11/15.
 */
public class Dresses {

    byte[] _image;

    // Empty constructor
    public Dresses() {

    }

    // constructor
    public Dresses( byte[] image) {

        this._image = image;

    }
    // getting phone number
    public byte[] getImage() {
        return this._image;
    }

    // setting phone number
    public void setImage(byte[] image) {
        this._image = image;
    }
}

