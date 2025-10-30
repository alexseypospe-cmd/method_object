public class Main {
    public static void main(String[] args) {
        // Тестирование класса Product
        Product p1 = new Product(101, "Ноутбук", 50000, "Электроника");
        Product p2 = new Product(101, "Планшет", 30000, "Электроника");
        Product p3 = new Product(102, "Клавиатура", 2000, "Аксессуары");
        Product p4 = new Product(101, "Смартфон", 40000, "Электроника"); // id и category совпадают с p1

        System.out.println("Товары:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Сравнение товаров:");
        System.out.println();
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p2.equals(p3): " + p2.equals(p3));
        System.out.println("p3.equals(p4): " + p3.equals(p4));
        System.out.println("p1.equals(p4): " + p1.equals(p4));

        // Тестирование класса Order
        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2};
        Product[] basket3 = {p2, p1}; // другой порядок
        Product[] basket4 = {p1, p3}; // другой товар

        Order o1 = new Order("Иван Иванов", basket1);
        Order o2 = new Order("Иван Иванов", basket2);
        Order o3 = new Order("Петр Петров", basket1);
        Order o4 = new Order("Иван Иванов", basket3);
        Order o5 = new Order("Иван Иванов", basket4);

        System.out.println("Заказы:");
        System.out.println();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

        System.out.println("Сравнение заказов:");
        System.out.println();
        System.out.println("o1.equals(o2): " + o1.equals(o2));
        System.out.println("o2.equals(o3): " + o2.equals(o3));
        System.out.println("o3.equals(o4): " + o3.equals(o4));
        System.out.println("o4.equals(o5): " + o4.equals(o1));


    }
}


