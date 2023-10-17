package WorkingWithAbstractionsExercise.TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trafficLightsLine = scanner.nextLine();
        String[] trafficLightParts = trafficLightsLine.split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[trafficLightParts.length];
        for (int i = 0; i < trafficLightParts.length; i++) {
            String s = trafficLightParts[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            updateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }
    }

    private static void printTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            System.out.print(trafficLight.getSignal() + " ");
        }
        System.out.println();
    }

    private static void updateTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.update();
        }

    }
}
