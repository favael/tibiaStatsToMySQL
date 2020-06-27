package api;

import models.DataConvert;
import models.SimpleStats;
import models.StatisticsDataConverer;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class TibiaApi implements Api {
    private OkHttpClient httpClient = OkHttp.INSTANCE.getClient();
    private RequestBuilder requestBuilder = new TibiaRequestBuilder();
    private DataConvert dataConverter = new StatisticsDataConverer();


    public SimpleStats getHighcoreStat (String world) throws IOException, InterruptedException {
        Request request = requestBuilder.newRequest(world);
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            String json = response.body().string();
            SimpleStats simpleStats = dataConverter.convertData(json);

            return simpleStats;
        } else {
            throw new HighscoreApiException("Pobieranie danych sie nie powiodło" + response.message(), response.code());
        }
    }
}






