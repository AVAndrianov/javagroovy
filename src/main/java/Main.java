import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1, 3, 4, 5, 1, 5, 4};
        Map<String, Integer> map = Arrays.stream(arr).boxed().collect(Collectors.toMap(String::valueOf, i -> 1, Integer::sum));
        map.entrySet().forEach(System.out::println);

        String url = System.getProperty("user.dir")
                + System.getProperty("file.separator")
                + "src/main/java/script.groovy";

        GroovyShell shell = new GroovyShell();
        shell.evaluate(new File(url));
    }
}
