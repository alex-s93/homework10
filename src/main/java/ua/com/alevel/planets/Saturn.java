package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Saturn extends AbstractPlanet implements PlanetAcceleration {
    private double radius = 60.100 * Math.pow(10, 6);
    private double weight = 5.7 * Math.pow(10, 26);

    public Saturn() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
