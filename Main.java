import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/kirill/IdeaProjects/lab6/text.txt";
        File file = new File(filePath);
        Map<String, Integer> dict = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String temp = scanner.next();
                dict.put(temp, dict.getOrDefault(temp, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dict.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}