package World;

/**
 * Created by LordwolF on 8/7/2016.
 */
public class Oak extends Plant {


    public Oak() {

        //wont work---type is private
        //type = "tree";

        //this works-- size is protected, but this is a subclass
        this.size = "large";

        this.height = 10;


    }

}
