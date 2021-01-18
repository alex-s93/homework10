package ua.com.alevel;

import ua.com.alevel.helpers.PlanetReporter;
import ua.com.alevel.helpers.PlanetScanner;
import ua.com.alevel.planets.*;

public class Main {
    public static void main(String[] args) {
        PlanetScanner scanner = new PlanetScanner();
        PlanetReporter reporter = new PlanetReporter();

        String planetName = scanner.getPlanetName();
        AbstractPlanet planet = planetInit(planetName);
        double acceleration = planet.acceleration();
        reporter.printInfo(planetName, acceleration);
    }

    private static AbstractPlanet planetInit(String planet) {
        AbstractPlanet p;
        switch(planet) {
            case "Earth":
                p = new Earth();
                break;
            case "Jupiter":
                p = new Jupiter();
                break;
            case "Mars":
                p = new Mars();
                break;
            case "Mercury":
                p = new Mercury();
                break;
            case "Neptune":
                p = new Neptune();
                break;
            case "Saturn":
                p = new Saturn();
                break;
            case "Uranus":
                p = new Uranus();
                break;
            case "Venus":
                p = new Venus();
                break;
            default:
                throw new RuntimeException("Entered planet does not exist");
        }
        return p;
    }
}
