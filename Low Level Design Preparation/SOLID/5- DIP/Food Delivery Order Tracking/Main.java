public class Main {

    public static void main(String[] args) {
        
        OrderTrackingService google = new GoogleMapsTracker("1456AB", "Chennai", "Dindigul");
        DeliveryService googDeliveryService = new DeliveryService(google);
        googDeliveryService.trackOrder("Madurai");

        OrderTrackingService map = new MapMyIndiaTracker("1485##", "Chennai", "Dindigul");
        DeliveryService mapDeliveryService = new DeliveryService(map);
        mapDeliveryService.trackOrder("Chengalpattu");
    }
}