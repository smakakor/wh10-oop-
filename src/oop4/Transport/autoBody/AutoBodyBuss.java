package oop4.Transport.autoBody;

public enum AutoBodyBuss {
    ESPECIALLY_SMALL(0,10),
    SMALL(10,25),
    AVERAGE(40, 50),
    BIG(60,80),
    ESPECIALLY_BIG(100, 120);

    private final double from;
    private final double to;


    AutoBodyBuss(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
