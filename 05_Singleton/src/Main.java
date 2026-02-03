//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {

    Logger logger = Logger.getInstance();
    logger.setFileName("new_log.txt"); // Change file name
    logger.write("Simulation started");
    logger.write("Processing data...");
    logger.write("Simulation finished");
    logger.close(); // Remember to close the logger

}
