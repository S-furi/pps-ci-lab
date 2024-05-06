import counter.Counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCounter {
    private final Counter counter = new Counter();

    @BeforeEach
    public void setUp() {
        this.counter.reset();
    }

    @Test
    public void testCounterCreation() {
        final Counter c1 = new Counter();
        final Counter c2 = new Counter(420);
        
        assertEquals(0, c1.getValue());
        assertEquals(420, c2.getValue());
    }

    @Test
    public void testCounterIncrementation() {
        IntStream.range(0, 10).forEach(i -> this.counter.inc());
        assertEquals(10, this.counter.getValue());
    }
}
