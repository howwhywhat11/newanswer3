package numberthree;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //新建三个物品
        Item stone = new Item("石头");
        Item wood = new Item("木板");
        Item diamondSward = new Item("钻石剑");
        //新建一个背包
        ArrayList<ItemStack> item = new ArrayList<>();
        Inventory inventory = new Inventory(item);

        ItemStack itemStack1 = new ItemStack(stone,30);
        int i1 = inventory.addItem(itemStack1);
        inventory.display();
        ItemStack itemStack2 = new ItemStack(stone,40);
        int i2 = inventory.addItem(itemStack2);
        inventory.display();
        ItemStack itemStack3 = new ItemStack(diamondSward,1);
        int i3 =  inventory.addItem(itemStack3);
        inventory.display();
        ItemStack itemStack4 = new ItemStack(wood,64);
        for (int i = 0; i < 35; i++) {
            inventory.addItem(itemStack4);
        }
        inventory.display();
        inventory.removeItem("石头",10);
        inventory.display();
    }
}
