import java.util.Scanner;

public class HomeWorkCelsious {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Celsious celsius = new Celsious();

        System.out.println("Назовите ваше имя : ");
        celsius.name = scanner.nextLine();
        System.out.println("Ваше имя:" + celsius.name);

        System.out.println("Назовите число в градусах по Цельсию: ");
        celsius.CelsiousDegree = scanner.nextInt();
        System.out.println("Ваше число по цельсию равняется: " + celsius.CelsiousDegree);
        System.out.println();
        celsius.Farenheitresult();
    }
}
