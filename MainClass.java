public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Cat[] cats = new Cat[3];
    cats[0] = new Cat("Чернушка", 3);
    cats[1] = new Cat("Мурзик", 4);
    cats[2] = new Cat("Барсик", 5);
    
    Plate plate = new Plate(10);
    plate.info(); 
    
    for (Cat cat : cats) {
        cat.eat(plate);
        System.out.println(cat.getName() + ": " + cat.isFull());
    }
}
}