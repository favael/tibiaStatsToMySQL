package api;

import models.Data;
import models.DataConvert;
import models.Statistic;
import models.StatisticsDataConverer;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class TibiaApi implements Api {
    private OkHttpClient httpClient = OkHttp.INSTANCE.getClient();
    private RequestBuilder requestBuilder = new TibiaRequestBuilder();
    private DataConvert dataConverter = new StatisticsDataConverer();

    public Data getDataList(String world) throws IOException, InterruptedException {
        Request request = requestBuilder.newRequest(world);
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            String json = response.body().string();
            System.out.println(json);
            return dataConverter.convertData(json);

        } else {
            throw new HighscoreApiException("Pobieranie danych sie nie powiodło" + response.message(), response.code());
        }
    }


    public Statistic getHighcoreList(String world) throws IOException, InterruptedException {
        Request request = requestBuilder.newRequest(world);
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            String json = response.body().string();
            return dataConverter.convertStatistic(json);

        } else {
            throw new HighscoreApiException("Pobieranie danych sie nie powiodło" + response.message(), response.code());
        }
    }
}






