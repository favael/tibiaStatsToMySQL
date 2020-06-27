package models;

public interface DataConvert {
    SimpleStats convertData(String json) throws InterruptedException;
}
