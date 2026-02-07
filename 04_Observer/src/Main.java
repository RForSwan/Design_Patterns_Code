void main() throws InterruptedException {
    WeatherStation ws = new WeatherStation();
    WeatherStationObserver wsObserver1 = new WeatherStationObserver();
    WeatherStationObserver wsObserver2 = new WeatherStationObserver();
    WeatherStationObserver wsObserver3 = new WeatherStationObserver();

    wsObserver1.setMessage("Last temp recorded by wsObserver1 is ");
    wsObserver2.setMessage("Last temp recorded by wsObserver2 is ");
    wsObserver3.setMessage("Last temp recorded by wsObserver3 is ");

    ws.addObserver(wsObserver1);
    ws.addObserver(wsObserver2);
    ws.addObserver(wsObserver3);

    Thread thread = new Thread(ws);
    thread.start();

    Thread.sleep(10000);

    ws.removeObserver(wsObserver3);
}
