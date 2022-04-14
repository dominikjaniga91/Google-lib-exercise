package set;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import com.google.common.collect.Sets;

/**
 * @author Dominik_Janiga
 */
@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 20, timeUnit = TimeUnit.MILLISECONDS,  time = 10)
@Warmup(iterations = 10, timeUnit = TimeUnit.MILLISECONDS, time = 10)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class SetComparison {

    public static void main(String[] args) throws IOException {

        Main.main(args);
    }

    @Benchmark
    public void testEnumSet() {
        final Set<Examples> set = Examples.set;
        for (final Examples example : set) {
            System.out.println(example);
        }
    }

    @Benchmark
    public void testImmutableSet() {
        final Set<Examples> immutableSet = Examples.immutableSet;
        for (final Examples example : immutableSet) {
            System.out.println(example);
        }
    }
}

enum Examples {

    EXAMPLE_1,
    EXAMPLE_2,
    EXAMPLE_3,
    EXAMPLE_4,
    EXAMPLE_5,
    EXAMPLE_6,
    EXAMPLE_7,
    EXAMPLE_8,
    EXAMPLE_9,
    EXAMPLE_10,
    EXAMPLE_11,
    EXAMPLE_12,
    EXAMPLE_13,
    EXAMPLE_14;


    static Set<Examples> set = EnumSet.of(EXAMPLE_1,
            EXAMPLE_2,
            EXAMPLE_3,
            EXAMPLE_4,
            EXAMPLE_5,
            EXAMPLE_6,
            EXAMPLE_7,
            EXAMPLE_8,
            EXAMPLE_9,
            EXAMPLE_10,
            EXAMPLE_11,
            EXAMPLE_12);

    static Set<Examples> immutableSet = Sets.immutableEnumSet(EXAMPLE_1,
            EXAMPLE_2,
            EXAMPLE_3,
            EXAMPLE_4,
            EXAMPLE_5,
            EXAMPLE_6,
            EXAMPLE_7,
            EXAMPLE_8,
            EXAMPLE_9,
            EXAMPLE_10,
            EXAMPLE_11,
            EXAMPLE_12);

}