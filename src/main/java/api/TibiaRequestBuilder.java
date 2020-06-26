package api;

import okhttp3.HttpUrl;
import okhttp3.Request;



public class TibiaRequestBuilder implements RequestBuilder {
    private UrlProvider urlProvider = new UrlProvider();

    @Override
    public Request newRequest(String server) {
        HttpUrl url = urlProvider.createUrl(server);
        System.out.println(url);
        return new Request.Builder()
                .url(url)
                .build();
    }

}
