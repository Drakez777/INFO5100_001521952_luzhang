import java.util.ArrayList;
import java.util.List;

// Singleton Design Pattern
class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Factory Design Pattern
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory {
    public Shape createShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        }
        return null;
    }
}

// Observer Design Pattern
interface Observer {
    void update(String message);
}

class MessagePublisher {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class MessageSubscriber implements Observer {
    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}



