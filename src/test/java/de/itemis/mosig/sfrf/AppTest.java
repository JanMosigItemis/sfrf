package de.itemis.mosig.sfrf;

import org.junit.jupiter.api.Test;

import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.MemorySegment;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test_something() {
        try (var seg = MemorySegment.allocateNative(MemoryLayouts.ADDRESS)) {

        }
    }
}
