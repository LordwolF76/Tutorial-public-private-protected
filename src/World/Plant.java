package World;

/**
 * Created by LordwolF on 8/7/2016.
 */


public class Plant {
    //bad practice
    public String name;

    //acceptable because setting static final
    public final static int ID = 8;


    protected String size;

    private String type;


    //package level visibilty since it is not declared public, private, or protected
    int height;

    public Plant() {
        this.name = "Poison Ivy";

        this.type = "plant";

        this.size = "medium";


    }
}
