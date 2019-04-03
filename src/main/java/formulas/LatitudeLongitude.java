package formulas;

class LatitudeLongitude {

    static double distanceInKm(double latA, double lonA, double latB, double lonB) {

        final int EARTH_RADIUS_KM = 6371;

        double radLonA = Math.toRadians(lonA);
        double radLatA = Math.toRadians(latA);
        double radLonB = Math.toRadians(lonB);
        double radLatB = Math.toRadians(latB);

        double x;
        double y;
        double distance;

        x = (radLonB - radLonA) * Math.cos((radLatA + radLatB) / 2);
        y = (radLatB - radLatA);
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * EARTH_RADIUS_KM;

        return distance;
    }
}
