package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Uranus extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 26.500 * Math.pow(10, 6);
    private double weight = 8.7 * Math.pow(10, 25);

    public Uranus() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
