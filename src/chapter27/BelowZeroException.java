package chapter27;

public class BelowZeroException extends RuntimeException {
    public static final  long serialVersionUID = -7034897190748766939L;
    private int code;

    public BelowZeroException() {
        super();
    }

    public BelowZeroException(String message, int code) {
        super(message);
        this.code = code;
    }
}
