package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Mars extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 3.488 * Math.pow(10, 6);
    private double weight = 6.4 * Math.pow(10, 23);

    public Mars() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
