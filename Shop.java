import java.util.*;

public class Shop {
    private List<String> sellProduct = new LinkedList<>();
    private HashMap<String, Integer> cost = new HashMap<>(16);

    public Shop(){
        cost.put("Яблоко", 150);
        cost.put("Груша", 180);
        cost.put("Дыня", 200);
        cost.put("Киви", 250);
        cost.put("Банан", 275);
    }
    public void setSoldItems(String title){
      sellProduct.add(title);
    }

    public List getSoldItems(){
        return sellProduct;
    }

    public int getSum(){
        int sum = 0;
        for (String i : sellProduct) {
            sum += cost.get(i);
        }
        return sum;
    }

    public String mostPopular(){
        int count = 0;
        String popular = "";
        Map<String, Integer> lass = new HashMap<>();
        for(String i : sellProduct) {
            lass.put(i, lass.getOrDefault(i, 0) + 1);
            if(count < lass.get(i)) {
                count = lass.get(i);
                popular = i;
            }
        }
        return popular;
    }

}