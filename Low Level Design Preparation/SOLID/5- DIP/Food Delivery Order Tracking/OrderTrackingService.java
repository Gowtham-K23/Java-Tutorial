public interface OrderTrackingService
{
    public void startTracking();
    public String updateLocation(String currLocation);
    public void stopTracking();
}