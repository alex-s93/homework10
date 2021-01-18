package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Neptune extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 24.750 * Math.pow(10, 6);
    private double weight = 1.02 * Math.pow(10, 26);

    public Neptune() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
