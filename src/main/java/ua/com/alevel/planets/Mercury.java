package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Mercury extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 2.439 * Math.pow(10, 6);
    private double weight = 3.3 * Math.pow(10, 23);

    public Mercury() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
