package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name ="TibiaAll")
public class Data  implements Serializable   {
    @Id
    @GeneratedValue
    private Long id;
    @SerializedName("name")
    @Expose
    @Column(name = "name", unique = false, nullable = false)
    private String name;
//    @SerializedName("rank")
//    @Expose
//    @Column(name = "rank")
//    private int rank;
    @SerializedName("voc")
    @Expose
    @Column(name = "voc")
    private String voc;
    @SerializedName("points")
    @Expose
    @Column(name = "points")
    private long points;
    @SerializedName("level")
    @Expose
    @Column(name = "level")
    private int level;


    public Data (String name, int rank, String voc, long points, int level) {
        this.name = name;
//        this.rank = rank;
        this.voc = voc;
        this.points = points;
        this.level = level;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getRank() {
//        return rank;
//    }

//    public void setRank(int rank) {
//        this.rank = rank;
//    }

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



    @Override
    public String toString () {
        return "name = " + name + ", voc = " + voc  + ", points = " + points + ", level = " + level  + "\n" ;
    }
}
