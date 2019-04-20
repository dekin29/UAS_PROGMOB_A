package com.example.uas_progmob;

import android.os.Parcel;
import android.os.Parcelable;

public class Awatara implements Parcelable {
    private String name, remarks, photo, description;

    protected Awatara(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        description = in.readString();
    }

    public static final Creator<Awatara> CREATOR = new Creator<Awatara>() {
        @Override
        public Awatara createFromParcel(Parcel in) {
            return new Awatara(in);
        }

        @Override
        public Awatara[] newArray(int size) {
            return new Awatara[size];
        }
    };

    public Awatara() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(remarks);
        dest.writeString(photo);
        dest.writeString(description);
    }

}
