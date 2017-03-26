package com.example.android.loginactivity;

/**
 * Created by Manish on 23-03-2017.
 */
import com.google.firebase.database.IgnoreExtraProperties;

public class Data {

    public String name;
    public String email;
    public String add;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Data() {
    }

    public Data(String name, String email, String add) {
        this.name = name;
        this.email = email;
        this.add = add;
    }
}
