package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Earth extends AbstractPlanet {
    private double radius = 6.378 * Math.pow(10, 6);
    private double weight = 6 * Math.pow(10, 24);

    public Earth() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
