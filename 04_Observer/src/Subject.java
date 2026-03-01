import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObserver(int temperature)
    {
        for(Observer observer : observers) observer.update(temperature);
    }
}
