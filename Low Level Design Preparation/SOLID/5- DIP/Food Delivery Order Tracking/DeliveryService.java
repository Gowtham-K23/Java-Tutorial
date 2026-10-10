public class DeliveryService 
{
    private OrderTrackingService tracker;
    
    public DeliveryService(OrderTrackingService tracker)
    {
        this.tracker = tracker;
    }

    public void trackOrder(String currentLocation)
    {
        tracker.startTracking();
        String update = tracker.updateLocation(currentLocation);
        tracker.stopTracking();
    }
}
