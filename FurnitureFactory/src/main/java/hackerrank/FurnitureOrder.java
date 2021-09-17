package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
        HashMap<Furniture, Integer> furnitureMap;
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        furnitureMap = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        furnitureMap.put(type, furnitureMap.getOrDefault(type, 0) + 1);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return furnitureMap;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method

        float totalCost = 0.0f;
        for(Furniture key : furnitureMap.keySet())
        {
            totalCost += key.cost();
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method

        int typeCount = 0;
        if(furnitureMap.size() > 0) {
            return furnitureMap.size();
        }
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method

        if(furnitureMap.containsKey(type)){
            return type.cost();
        }

        return -1.0f;
    }
    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalOrderQty = 0;
        for(Furniture key : furnitureMap.keySet())
        {
            totalOrderQty += furnitureMap.get(key);
        }
        return totalOrderQty;
    }
}