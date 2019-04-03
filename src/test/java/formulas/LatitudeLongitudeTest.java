package formulas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LatitudeLongitudeTest {

    @Test
    void distanceInKm() {
        double latA = -122.446747;
        double lonA = 37.733795;
        double latB = 40.730610;
        double lonB = -73.935242;

        assertEquals(20430.886373418238, LatitudeLongitude.distanceInKm(latA, lonA, latB, lonB));
    }

}
