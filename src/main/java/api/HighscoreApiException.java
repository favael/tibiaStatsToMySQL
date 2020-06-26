package api;

public class HighscoreApiException extends RuntimeException {
    private final int code;

    public HighscoreApiException(String message, int code) {
        super(message);
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
