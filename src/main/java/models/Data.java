package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Data extends Highscores implements Serializable {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rank")
    @Expose
    private int rank;
    @SerializedName("voc")
    @Expose
    private String voc;
    @SerializedName("points")
    @Expose
    private long points;
    @SerializedName("level")
    @Expose
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getVoc() {
        return voc;
    }

    public void setVoc(String voc) {
        this.voc = voc;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Data () {
    }

    public Data (String name, int rank, String voc, long points, int level) {
        this.name = name;
        this.rank = rank;
        this.voc = voc;
        this.points = points;
        this.level = level;
    }

    @Override
    public String toString () {
        return "name = " + name + ", rank = " + rank + ", voc = " + voc  + ", points = " + points + ", level = " + level  + "\n" ;
    }
}
