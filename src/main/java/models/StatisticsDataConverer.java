package models;

import com.google.gson.Gson;

public class StatisticsDataConverer implements DataConvert {
    private final Gson gson = new Gson();


    @Override
    public SimpleStats convertData(String json) {
        Data data = gson.fromJson(json, Data.class);
        return simplifyHighscore(data);
    }

    private SimpleStats simplifyHighscore(Data data) {
        SimpleStats simpleStats = new SimpleStats();

simpleStats.setName(data.getName());
simpleStats.setLevel(data.getLevel());
simpleStats.setPoints(data.getPoints());
simpleStats.setVoc(data.getVoc());
simpleStats.setRank(data.getRank());





        return simpleStats;
    }
}
