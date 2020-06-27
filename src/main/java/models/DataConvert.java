package models;

public interface DataConvert {
    Statistic convertStatistic(String json) throws InterruptedException;
    Data convertData(String json) throws InterruptedException;

}
