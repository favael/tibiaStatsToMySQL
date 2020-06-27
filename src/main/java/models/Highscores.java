package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Highscores implements Serializable {
    @SerializedName("world")
    @Expose
    private String world;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("data")
    @Expose
    private ArrayList<Data> data = new ArrayList<>();

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }





    @Override
    public String toString () {
        return data + "\n";
    }
}
