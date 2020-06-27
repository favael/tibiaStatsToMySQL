package api;

import models.Statistic;

import java.io.IOException;

public interface Api {

    Statistic getHighcoreList(String world) throws IOException, InterruptedException;

}
