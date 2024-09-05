package edu.brown.cs32.livecode;

import java.util.List;

/**
 * In-class livecode demo: start here
 */
public class Main {
    public static void main(String[] args) {
        Student<String> tim = new Student<>(
                List.of("lecture notes", "email", "email", "family", "email"));
        String common = tim.mostCommonTodoItem();
        System.out.println(common);

        Student<Integer> nim = new Student<>(
                List.of(1,2,3)
        );
        // Should this produce an error? What do you think?
        // String x = null;
    }
}
