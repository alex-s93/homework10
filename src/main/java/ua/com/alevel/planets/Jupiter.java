package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Jupiter extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 71.300 * Math.pow(10, 6);
    private double weight = 1.9 * Math.pow(10, 27);

    public Jupiter() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
