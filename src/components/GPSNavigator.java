package components;

public class GPSNavigator {
    private String route;

    public GPSNavigator (){
        this.route = "Choice your destination";
    }

    public GPSNavigator (String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute (){
        return route;
    }
}
