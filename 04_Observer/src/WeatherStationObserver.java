import java.util.Random;

public class WeatherStationObserver implements Observer
{
    private float lastTemp = 0;
    private String message = "Last temp recorded is ";

    private String getLastTemp()
    {
        return Float.toString(lastTemp) + "°C";
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void displayLastTemp()
    {
        System.out.println(message + getLastTemp());
    }

    @Override
    public void update(int temperature)
    {
        lastTemp = temperature;
        displayLastTemp();
    }


}
