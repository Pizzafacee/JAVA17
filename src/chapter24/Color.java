package chapter24;

public enum Color {
    GREEN(233, 2, 2, "绿色"),
    YELLOW(233, 4, 11, "黄色"),
    WHITE(0, 0, 0, "白色"),
    RED(23, 11, 33, "红色");
    private final int R;
    private final int G;
    private final int B;
    private final String DESC;

    Color(int r, int g, int b, String DESC) {
        R = r;
        G = g;
        B = b;
        this.DESC = DESC;
    }

    public int getR() {
        return R;
    }

    public int getG() {
        return G;
    }

    public int getB() {
        return B;
    }

    public String getDESC() {
        return DESC;
    }
}
