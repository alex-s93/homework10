package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Venus extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 6.052 * Math.pow(10, 6);
    private double weight = 4.9 * Math.pow(10, 24);

    public Venus() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
