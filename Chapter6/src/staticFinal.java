/**
 * Created by jusk2 on 2017-01-04.
 */
public class staticFinal {

  static final double EARTH_RADIUS = 6400;
  static final double EARTH_SURFACE_AREA;

  static {
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}
