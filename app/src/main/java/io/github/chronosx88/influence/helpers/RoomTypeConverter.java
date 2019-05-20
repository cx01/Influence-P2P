package io.github.chronosx88.influence.helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import androidx.room.TypeConverter;

import io.github.chronosx88.influence.models.GenericUser;

public class RoomTypeConverter {

    @TypeConverter
    public static ArrayList<GenericUser> fromString(String value) {
        Type listType = new TypeToken<ArrayList<String>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static <T> String fromArrayList(ArrayList<GenericUser> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

}
