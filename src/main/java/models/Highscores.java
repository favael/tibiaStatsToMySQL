package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Highscores  implements Serializable {

    @SerializedName("world")
    @Expose
    private String world;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("data")
    @Expose
    private ArrayList<Data> data = new ArrayList<>();


    public ArrayList<Data> getData() {
        return data;
    }

    public Data getByIndex(int rank) {
        return data.get(rank -1);
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }


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
    public String toString() {
        return "Highscores{" +
                "world='" + world + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
