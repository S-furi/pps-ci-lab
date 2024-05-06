package counter;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(final int initVal) {
        this.value = initVal;
    }

    public void inc() {
        this.value++;
    }

    public void reset() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }
}
