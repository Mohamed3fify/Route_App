package com.example.routeapp;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
public class App implements Parcelable {
    private String courseImage  ;
    private String courseButton;

    public App(int courseImage, String courseButton) {
        this.courseImage = String.valueOf(courseImage);
        this.courseButton = courseButton;
    }
    public App() {

    }
    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public String getCourseButton() {
        return courseButton;
    }

    public void setCourseButton(String courseButton) {
        this.courseButton = courseButton;
    }

    protected App(Parcel in) {
        courseImage = String.valueOf(in.readInt());
        courseButton = in.readString();
    }

    public static final Creator<App> CREATOR = new Creator<App>() {
        @Override
        public App createFromParcel(Parcel in) {
            return new App(in);
        }

        @Override
        public App[] newArray(int size) {
            return new App[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(courseImage);
        dest.writeString(courseButton);
    }

    @Override
    public String toString() {
        return "App{" +
                "courseImage='" + courseImage + '\'' +
                ", courseButton='" + courseButton + '\'' +
                '}';
    }
}
