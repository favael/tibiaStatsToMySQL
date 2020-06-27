package models;

import com.google.gson.Gson;


public class StatisticsDataConverer implements DataConvert {
Gson gson = new Gson();



    @Override
    public Statistic convertStatistic(String json) throws InterruptedException {
        Statistic statistic = gson.fromJson(json,Statistic.class);
        return statistic;

    }

    @Override
    public Data convertData(String json) throws InterruptedException {
        Data data = gson.fromJson(json,Data.class);
        return data;
    }

}

