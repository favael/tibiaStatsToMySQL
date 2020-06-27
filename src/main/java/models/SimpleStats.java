package models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Tibia")
public class SimpleStats  implements Serializable {

    @SerializedName("name")
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "rank")
    @SerializedName("rank")
    private int rank;
    @SerializedName("voc")
    @Column(name = "voc")
    private String voc;
    @SerializedName("points")
    @Column(name = "points")
    private int points;
    @SerializedName("level")
    @Column(name = "level")
    private int level;

    public SimpleStats () {
    }

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

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    }

