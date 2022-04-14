package set;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

/**
 * @author Dominik_Janiga
 */
public class SetRemoving {

    public static void main(String[] args) throws IOException {

        Examples.set.remove(Examples.EXAMPLE_1);
        System.out.println(Examples.set);
    }
}
