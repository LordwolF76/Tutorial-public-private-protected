import World.Plant;

/**
 * Created by LordwolF on 8/7/2016.
 *
 * private --- only within same class
 * public  --- from anywhere
 * protected -- subclass and same package
 * no modifier - same package only
 * 
 */



public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);


        //this doesnt work because size is protected in the other package
        //System.out.println(plant.size);


        // also doesnt work-- height is part of World Package not this package
        //System.out.println(plant.height);
    }
}
