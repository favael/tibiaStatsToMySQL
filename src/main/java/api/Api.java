package api;

import models.SimpleStats;

import java.io.IOException;

public interface Api {

    SimpleStats getHighcoreStat (String world) throws IOException;

}
