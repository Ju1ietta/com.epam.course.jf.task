package task06and07;

@NuclearSubmarineAnnotation(author = "Yulia", version = 1.0)
public class NuclearSubmarine {
    private String name;
    private Engine engine;
    public NuclearSubmarine(String name, int capacity) {
        this.name = name;
        engine = new Engine(capacity);
    }
    class Engine{
        public int capacity;

        public Engine(int capacity) {
            this.capacity = capacity;
        }
    }
    public String run(){
        return ("Engine " + name + " of nuclear submarine with " + engine.capacity + " capacity has run!");
    }
}
