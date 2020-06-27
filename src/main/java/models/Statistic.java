package models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Statistic implements Serializable {

    @SerializedName("highscores")
    @Expose
    private Highscores highscores;
    @SerializedName("information")
    @Expose
    private Information information;

    public Statistic () {
    }

    public Statistic (Highscores highscores, Information information) {
        this.highscores = highscores;
        this.information = information;
    }

    public Highscores getHighscores () {
        return highscores;
    }

    public void setHighscores (Highscores highscores) {
        this.highscores = highscores;
    }

    public Information getInformation () {
        return information;
    }

    public void setInformation (Information information) {
        this.information = information;
    }



    @Override
    public String toString () {
        return
                 highscores  + "\n" + information +  "\n";
    }
}
