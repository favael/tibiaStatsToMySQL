package models;

import com.google.gson.Gson;


public class StatisticsDataConverer implements DataConvert {



    @Override
    public SimpleStats convertData(String json) throws InterruptedException {
        Statistic statistic = new Gson().fromJson(json, Statistic.class);
        System.out.println(statistic);
        return simplifyHighscore(statistic);
    }

    private SimpleStats simplifyHighscore(Statistic statistic) {

SimpleStats simpleStats = new SimpleStats();
simpleStats.setName(statistic.getHighscores().toString());
        return simpleStats;
    }
}
