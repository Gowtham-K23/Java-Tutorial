public class MapMyIndiaTracker implements OrderTrackingService
{
    private String orderId;
    private String startingPoint;
    private String endingPoint;

    public MapMyIndiaTracker(String orderId, String startingPoint, String endingPoint)
    {
        this.orderId = orderId;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public void startTracking()
    {
        System.out.println("Tracking with MapMyIndiaTracker");
        System.out.println("Order ID: " + orderId + " started delivery from " + startingPoint);
    }

    public String updateLocation(String currLoc)
    {
        System.out.println("Tracking with MapMyIndiaTracker");
        return ("Order ID: " + orderId + " is currently located in " + currLoc);
    }

    public void stopTracking()
    {
        System.out.println("Tracking with MapMyIndiaTracker");
        System.out.println("Order ID: " + orderId + " successfully delivered to " + endingPoint);
    }
}