package functions;

public class ValueError extends Exception {
    String message;

    ValueError(String message) {
        this.message  = message;
    }

    public String getMessage() {
        return message;
    }
}
