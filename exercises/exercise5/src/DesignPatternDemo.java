public class DesignPatternDemo {
    public static void main(String[] args) {
        // Singleton Pattern
        Logger logger = Logger.getInstance();
        logger.log("This log message is from a singleton instance.");

        // Factory Pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        Shape square = shapeFactory.createShape("Square");

        circle.draw();
        square.draw();

        // Observer Pattern
        MessagePublisher messagePublisher = new MessagePublisher();
        Observer subscriber1 = new MessageSubscriber("Subscriber 1");
        Observer subscriber2 = new MessageSubscriber("Subscriber 2");

        messagePublisher.addObserver(subscriber1);
        messagePublisher.addObserver(subscriber2);

        messagePublisher.notifyObservers("New message for subscribers!");
    }
}