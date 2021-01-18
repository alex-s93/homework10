package ua.com.alevel.helpers;

import org.reflections.Reflections;
import ua.com.alevel.planets.AbstractPlanet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PlanetScanner {
    private List<String> planetsNames = new ArrayList<>();

    public PlanetScanner() {
        Reflections reflections = new Reflections("ua.com.alevel");
        Set<Class<? extends AbstractPlanet>> planets = reflections.getSubTypesOf(AbstractPlanet.class);
        for (Class planet: planets) {
            planetsNames.add(planet.getSimpleName());
        }
    }

    public String getPlanetName() {
        System.out.println("List of planets:");
        System.out.println(planetsNames);
        Scanner in = new Scanner(System.in);
        System.out.println("Please select one of the planet above for calculations and input it:");
        return in.nextLine();
    }
}
