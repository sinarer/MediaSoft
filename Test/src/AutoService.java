import java.util.*;

public class AutoService {

//создание массива
    public static void getRandom(){
        int[] Cars = new int[50];
        int Count = 0;
        int AgeCars = 0;
        for (int i = 0; i < 50; i++){
            int range = (2025 - 2000) + 1;
            Cars[i] = (int) (range * Math.random() + 2000);
            if(Cars[i] > 2015){
                Count++;
                AgeCars += Cars[i];
                System.out.println(Cars[i]);
            }

        }
        System.out.println("Средний возраст авто = " + (2025 - (AgeCars / Count)) + " лет");
    };

    public static void ListAuto() {
        ArrayList<String> Auto = new ArrayList<>();
        Auto.add("Toyota Camry");
        Auto.add("BMW X5");
        Auto.add("Tesla Model S");
        Auto.add("Audi A6");
        Auto.add("BMW X5");
        Auto.add("Tesla Model 3");
        Auto.add("Toyota Camry");

        for (int i = 0; i < Auto.size(); i++) {
            if (Auto.get(i).contains("Tesla")) {
                Auto.set(i, "ELECTRO_CAR");
            }
        }

        Set<String> uniqueCars = new HashSet<>(Auto);

        List<String> sortedCars = new ArrayList<>(uniqueCars);
        sortedCars.sort(Comparator.reverseOrder());

        System.out.println("Отсортированные модели:");
        for (String car : sortedCars) {
            System.out.println(car);
        }

        Set<String> NewSet = new LinkedHashSet<>(sortedCars);

    }

}
