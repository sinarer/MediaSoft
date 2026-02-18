
public static void main(String[] args) {
  /*  BankAccount Alice = new BankAccount("Alice");
    BankAccount Vova = new BankAccount("Vova");

    System.out.println(Alice.deposit(100));
    System.out.println(Alice.withdraw(30));
    System.out.println(Alice.withdraw(300));
    System.out.println(Alice.transfer(Vova, 50));
    System.out.println(Alice.transfer(Vova, 400));

    System.out.println(Alice);
    System.out.println(Vova);
    System.out.println(Alice.equals(Vova)); */


System.out.println("задание № 1");
AutoService.getRandom();

System.out.println("задание № 2");
AutoService.ListAuto();


System.out.println("задание № 3");
Set<Car> cars = new HashSet<>();

    cars.add(new Car("VIN111", "Camry", "Toyota", 2020, 50000, 20000));
    cars.add(new Car("VIN122", "X5", "BMW", 2022, 30000, 60000));
    cars.add(new Car("VIN111", "Camry", "Toyota", 2019, 70000, 18000));
    cars.add(new Car("VIN124", "A6", "Audi", 2021, 40000, 45000));

    System.out.println("Количество машин в HashSet: " + cars.size());

    System.out.println("задание № 4");
    List<Car> scar = new ArrayList<>();
    scar.add(new Car("VIN1", "Model S", "Tesla", 2023, 12000, 80000));
    scar.add(new Car("VIN2", "Camry", "Toyota", 2019, 60000, 20000));
    scar.add(new Car("VIN3", "X5", "BMW", 2021, 30000, 60000));
    scar.add(new Car("VIN4", "A6", "Audi", 2020, 45000, 50000));
    scar.add(new Car("VIN5", "Corolla", "Toyota", 2018, 80000, 15000));

    List<Car> lowMileageCars = scar.stream()
            .filter(c -> c.getMileage() < 50_000)
            .toList();


    List<Car> top3Expensive = scar.stream()
            .sorted(Comparator.comparing(Car::getPrice).reversed())
            .limit(3)
            .toList();


    double averageMileage = scar.stream()
            .mapToInt(Car::getMileage)
            .average()
            .orElse(0);


    Map<String, List<Car>> carsByManufacturer = scar.stream()
            .collect(Collectors.groupingBy(Car::getManufacturer));


    System.out.println("Малый пробег:");
    lowMileageCars.forEach(System.out::println);

    System.out.println("\nТоп-3 дорогих:");
    top3Expensive.forEach(System.out::println);

    System.out.println("\nСредний пробег: " + averageMileage);

    System.out.println("\nПо производителям:");
    carsByManufacturer.forEach((manufacturer, list) -> {
        System.out.println(manufacturer + ": " + list);
    });

}
