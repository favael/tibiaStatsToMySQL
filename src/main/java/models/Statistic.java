package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    public Highscores getHighscores() {
        return highscores;
    }

    public void setHighscores(Highscores highscores) {
        this.highscores = highscores;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}
