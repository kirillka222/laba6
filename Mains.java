public class Mains {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        myShop.setSoldItems("Яблоко");
        myShop.setSoldItems("Киви");
        myShop.setSoldItems("Киви");
        myShop.setSoldItems("Киви");
        myShop.setSoldItems("Яблоко");
        myShop.setSoldItems("Яблоко");
        myShop.setSoldItems("Банан");
        System.out.println(myShop.mostPopular());
        System.out.println(myShop.getSum());
        System.out.println(myShop.getSoldItems());     // список всех проданных товаров.
    }
}
