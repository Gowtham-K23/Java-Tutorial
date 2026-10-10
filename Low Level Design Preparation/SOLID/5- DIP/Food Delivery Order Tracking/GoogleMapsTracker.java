public class GoogleMapsTracker implements OrderTrackingService
{
    private String orderId;
    private String startingPoint;
    private String endingPoint;

    public GoogleMapsTracker(String orderId, String startingPoint, String endingPoint)
    {
        this.orderId = orderId;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    @Override 
    public void startTracking()
    {
        System.out.println("Tracking with GoogleMapsTracker");
        System.out.println("Order ID: " + orderId + " started delivery from " + startingPoint);
    }

    @Override 
    public String updateLocation(String currLoc)
    {
        System.out.println("Tracking with GoogleMapsTracker");
        return ("Order ID: " + orderId + " is currently located in " + currLoc);
    }

    public void stopTracking()
    {
        System.out.println("Tracking with GoogleMapsTracker");
        System.out.println("Order ID: " + orderId + " successfully delivered to " + endingPoint);
    }
}