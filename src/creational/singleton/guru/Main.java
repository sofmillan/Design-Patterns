package creational.singleton.guru;

public class Main {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance("FOO");
        Singleton secondInstance = Singleton.getInstance("BAR");

        System.out.println(firstSingleton.value);
        System.out.println(secondInstance.value);
        secondInstance.value="Ricky";
        System.out.println(firstSingleton.value);
        System.out.println(secondInstance.value);
    }
}
