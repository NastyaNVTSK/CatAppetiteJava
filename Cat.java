public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isFull() {
        return full;
    }
    
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            full = true;
        } else {
            full = false;
        }
    }
}
