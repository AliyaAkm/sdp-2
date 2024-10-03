public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА 1: Singleton для подключения к базе данных
        System.out.println("Задача 1: Singleton для подключения к базе данных");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        System.out.println(connection1 == connection2);
        System.out.println();

        // ЗАДАЧА 2: Фабрика для создания уведомлений
        System.out.println("Задача 2: Фабрика для создания уведомлений");
        NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();
        System.out.println();

        // ЗАДАЧА 3: Абстрактная фабрика для устройств (Apple и Samsung)
        System.out.println("Задача 3: Абстрактная фабрика для устройств (Apple и Samsung)");

        // Создаем AppleFactory
        DeviceFactory appleFactory = new AppleFactory();
        Smartphone appleSmartphone = appleFactory.createSmartphone();
        Laptop appleLaptop = appleFactory.createLaptop();
        appleSmartphone.getDetails();
        appleLaptop.getDetails();

        // Создаем SamsungFactory
        DeviceFactory samsungFactory = new SamsungFactory();
        Smartphone samsungSmartphone = samsungFactory.createSmartphone();
        Laptop samsungLaptop = samsungFactory.createLaptop();
        samsungSmartphone.getDetails();
        samsungLaptop.getDetails();
        System.out.println();

        // ЗАДАЧА 4: Паттерн Builder для создания дома
        System.out.println("Задача 4: Паттерн Builder для создания дома");
        House house = new House.HouseBuilder("Concrete", "Brick")
                .withRoof("Tiles")
                .withGarage(true)
                .withPool(false)
                .build();
        System.out.println(house);
        System.out.println();

        // ЗАДАЧА 5: Паттерн Prototype для клонирования фигур
        System.out.println("Задача 5: Паттерн Prototype для клонирования фигур");
        ShapeCache.loadCache();
        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedCircle.getType());
        clonedCircle.draw();

        Shape clonedRectangle = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedRectangle.getType());
        clonedRectangle.draw();
    }

}
