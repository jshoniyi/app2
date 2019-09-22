package com.example.john.tab2layout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;

import com.google.firebase.storage.StorageReference;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class FoodCart {

    String name;
    String location;
    private StorageReference mStorageRef;
    String image;

    public FoodCart(){}

    public FoodCart (String name, String location)
    {
        this.name =name;
        this.location =location;
    }

    public FoodCart (String name, String location, String image){
        this.name =name;
        this.location =location;
        this.image =image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location =location;
    }

    public String getImage() {

        return image;}
    public void setImage(String image){ this.image =image;}


    private static int lastContactId = 0;

    public static ArrayList<FoodCart> createFoodcartList(int numContacts) {
        ArrayList<FoodCart> contacts = new ArrayList<FoodCart>();

       // for (int i = 1; i <= numContacts; i++) {
       //     contacts.add(new FoodCart("Person " + ++lastContactId, "place"));
       // }

        return contacts;
    }


}








