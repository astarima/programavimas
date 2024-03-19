import javax.imageio.IIOException;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Car bmw = new Car("BMW", "X5");
        Car jaguar = new Car("Jaguar", "XF");
        Car nissan = new Car("Nissan", "GT-R");

        ArrayList<Car> cars = new ArrayList<>();



        Scanner scanner = new Scanner(System.in);
        Path file = Paths.get("file.txt");

            try {

            List<String> lines = Files.readAllLines(file);
            System.out.println(lines);

            for(String data : lines) {
                Car newCar = new Car(data);
                cars.add(newCar);
            }
            System.out.println(cars.size() + " cars loaded from " + file.getFileName());

            } catch (IOException e) {
                e.printStackTrace();
            }


        Car selectedCar = null;

        while (true) {
            System.out.println("Select your action (cars, deleteCar, createCar, select, engine, drive, fuel, quit)");
            String action = scanner.next();
            if (action.equals("quit")) break;

            switch (action) {
                case "load" -> {


                }
                case "save" -> {

                }

                case "deleteCar" -> {
                    System.out.println("What car");
                    int index = readNumber(scanner) - 1;

                    try {
                        cars.remove(index);
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Selected car does not exist!");
                    }



                }
                case "createCar" -> {
                    System.out.println("Choose a brand");

                    scanner.nextLine();
                    String brand = scanner.nextLine();
                    System.out.println("Choose a model");
                    String model = scanner.nextLine();

                    Car newCar = new Car(brand, model);
                    cars.add(newCar);

                }
                case "cars" -> {
                    for(int i = 0; i < cars.size(); i++) {
                        System.out.println(i + 1 + " - " + cars.get(i));
                    }
                }
                case "select" -> {
                    System.out.println("What car?");
                    int index = readNumber(scanner) - 1;

                    try {
                        selectedCar = cars.get(index);
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Selected car does not exist!");
                    }

                }
                case "engine" -> {
                    if(!checkSelection(selectedCar)) break;
                    boolean engine = selectedCar .switchEngine();
                    System.out.println(engine ? "Engine on" : "Engine off");
                }

                case "drive" -> {
                    if(!checkSelection(selectedCar)) break;
                    System.out.println("How many kilometers?");
                    int km = readNumber(scanner);
                    int distance = selectedCar.drive(km);
                    if (distance == -1) {
                        System.err.println("Turn on the engine");
                        break;
                    }
                        System.out.print(" Drove " + distance + "km");


                    if(selectedCar.getFuel() == 0) {
                        selectedCar.switchEngine();
                        System.err.println("Out of fuel, engine off");
                    }
                }
                case "fuel" -> {
                    if(!checkSelection(selectedCar)) break;
                    System.out.println("How many liters?");
                    int l = readNumber(scanner);
                    int newl = selectedCar.fuel(l);
                    if(newl == -1) {
                        System.err.println("Turn off the engine");

                    }
                        System.out.println("New fuel: " + l + "l");



                }
            }
        }
        try {
            String fileText = "";
            for (Car car : cars) {
                fileText += car.toFile() + "\n";
            }
            Files.writeString(file, fileText);

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

    private static int readNumber(Scanner scanner) {
        try{
            return scanner.nextInt();

        } catch (InputMismatchException e) {
            System.err.println("Enter a number!");
            return 0;
        }
    }

    private static boolean checkSelection(Car car) {
        if(car == null) {
            System.err.println("Select a car first!");
            return false;
        }
        return true;
    }
}