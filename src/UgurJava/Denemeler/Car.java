package UgurJava.Denemeler;

public class Car extends Vehicle{
    int y;

    Car(){
        super();
    }

    Car(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }
}
