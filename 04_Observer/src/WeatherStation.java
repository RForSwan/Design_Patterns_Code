import java.util.Random;

public class WeatherStation extends Subject implements Runnable
{
    private static int maxTemp =  50;
    private static int minTemp = -30;
    private int temperature;

    public WeatherStation()
    {
        Random rand = new Random();
        temperature = rand.nextInt(maxTemp - minTemp) + minTemp;
    }

    @Override
    public void run()
    {
        Random rand = new Random();
        for (int i = 0; i < 100; i++)
        {
            try {
                Thread.sleep(rand.nextInt(5) * 1000);

                temperature += rand.nextBoolean() ? -1 : 1;

                if(temperature > maxTemp) temperature = maxTemp;
                if(temperature < minTemp) temperature = minTemp;

                notifyObserver(temperature);
            } catch (InterruptedException e) {
                System.out.println("Weather Station has been interrupted");
            }
        }
    }
}
