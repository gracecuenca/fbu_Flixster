package com.example.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    // values from API
    private String title;
    private String overview;
    private String posterPath; // only the path

    // initialize from JSON data
    public Movie(JSONObject object){
        try {
            title = object.getString("title");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            overview = object.getString("overview");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            posterPath = object.getString("poster_path");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

}
