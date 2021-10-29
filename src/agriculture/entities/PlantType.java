package agriculture.entities;

import agriculture.content.PlantTypes;
import arc.util.Time;
import mindustry.type.Item;

public class PlantType {
    public int itemAmount;
    public Item item;

    public float minWater = 25f;
    public float maxWater = 25f;
    public float growthSpeed = 1f;

    public String name;

    public PlantType(String name, Item item, int itemAmount){
        this.name = name;
        this.item = item;
        this.itemAmount = itemAmount;

        PlantTypes.register(this);
    }

    public void update(Plant plant){
        plant.growth += (growthSpeed / 60f) * Time.delta;
    }

    public void die(Plant plant){
    }

    public void draw(Plant plant){
    }
}