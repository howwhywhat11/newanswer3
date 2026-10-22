package numberthree;

public class Item {
      private String name;//物品名称
      private int maxStackSize;//最大堆叠数量

    public Item() {
    }//无参构造

    //由物品名称决定最大堆叠数量
    public Item(String name) {
        if(name.equals("石头")||name.equals("木板")||name.equals("钻石剑")) {
            this.name = name;
            if (name.equals("石头")) {
                maxStackSize = 64;
            } else if (name.equals("木板")) {
                maxStackSize = 64;
            }
            if (name.equals("钻石剑")) {
                maxStackSize = 1;
            }
        }else {
            System.out.println("该物品不存在");
        }

    }

    public String getName() {
        return name;
    }

    //由物品名称决定最大堆叠数量
    public void setName(String name) {
        if(name.equals("石头")||name.equals("木板")||name.equals("钻石剑")) {
            this.name = name;
            if (name.equals("石头")) {
                maxStackSize = 64;
            } else if (name.equals("木板")) {
                maxStackSize = 64;
            }
            if (name.equals("钻石剑")) {
                maxStackSize = 1;
            }
        }else {
            System.out.println("该物品不存在");
        }

    }

    public int getMaxStackSize() {
        return maxStackSize;
    }


}
