import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        HashSet<String> set = new HashSet<>();
        for (String name : names1) {
            set.add(name);
        }
        for (String name : names2) {
            set.add(name);
        }

        String[] res = new String[set.size()];
        int index = 0;
        for (String s : set) {
            res[index] = s;
            index++;
        }

        return res;

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
