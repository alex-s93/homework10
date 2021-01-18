package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractPlanet implements PlanetAcceleration {
    private double radius;
    private double weight;
}
