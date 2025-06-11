/**
 * The Chair class represents a chair with a number of legs and a material type.
 */
public class Chair {
    private int legs;
    private String material;

    /**
     * Default constructor.
     * Sets legs to 4 and material to "wood".
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Constructor that takes one parameter for legs.
     * Material is set to "wood".
     *
     * @param legs the number of legs
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Constructor that takes two parameters for legs and material.
     *
     * @param legs the number of legs
     * @param material the material of the chair
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Returns the number of legs of the chair.
     * @return the number of legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Returns the material of the chair.
     * @return the material
     */
    public String getMaterial() {
        return material;
    }
}