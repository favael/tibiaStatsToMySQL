package api;

import okhttp3.HttpUrl;


class UrlProvider {
    private static final String DEFAULT_REQUEST_SCHEMA = "https";
    private static final String DEFAULT_REQUEST_HOST = "api.tibiadata.com";
    private static final String DEFAULT_REQUEST_SOURCE1 = "v2";
    private static final String DEFAULT_REQUEST_SOURCE2 = "highscores";



    public HttpUrl createUrl(String city) {
        return new HttpUrl.Builder()
                .scheme(DEFAULT_REQUEST_SCHEMA)
                .host(DEFAULT_REQUEST_HOST)
                .addPathSegments(DEFAULT_REQUEST_SOURCE1)
                .addPathSegment(DEFAULT_REQUEST_SOURCE2)
                .addPathSegment(city + ".json")
                .build();
    }
}

