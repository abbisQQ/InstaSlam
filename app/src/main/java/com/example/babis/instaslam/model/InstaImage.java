package com.example.babis.instaslam.model;

import android.net.Uri;

/**
 * Created by Babis on 3/15/2017.
 */

public class InstaImage {

        private Uri imageRecourseURL;


    public InstaImage(Uri imageRecourseURL) {
        this.imageRecourseURL = imageRecourseURL;
    }

    public Uri getImageRecourseURL() {
        return imageRecourseURL;
    }
}
