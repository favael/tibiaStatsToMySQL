package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Information implements Serializable {

    @SerializedName("api_version")
    @Expose
    private float api_version;
    @SerializedName("execution_time")
    @Expose
    private float execution_time;
    @SerializedName("last_updated")
    @Expose
    private String last_updated;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;


    // Getter Methods

    public float getApi_version() {
        return api_version;
    }

    public float getExecution_time() {
        return execution_time;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public String getTimestamp() {
        return timestamp;
    }

    // Setter Methods

    public void setApi_version(float api_version) {
        this.api_version = api_version;
    }

    public void setExecution_time(float execution_time) {
        this.execution_time = execution_time;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString () {
        return "Information{" +
                "api_version=" + api_version +
                ", execution_time=" + execution_time +
                ", last_updated='" + last_updated + '\'' +
                ", timestamp='" + timestamp;
    }
}

