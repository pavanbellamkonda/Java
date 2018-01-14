
package car;

/**
 *
 * @author pavan
 */
public class Car {

    int maxSpeed = 100, minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
    
    public void wreckCar(){
        condition = 'C';
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car familyCar = new Car();
        System.out.println("Family Car:");
        familyCar.printVariables();
        Car aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice Car:");
        aliceCar.printVariables();
    }
    
}
