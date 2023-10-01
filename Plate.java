public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public int getFood() {
        return food;
    }
    
    public void setFood(int food) {
        this.food = food;
    }
    
    public void addFood(int amount) {
        food += amount;
    }
    
    public void info() {
        System.out.println("Количество еды в тарелке: " + food);
    }
}

