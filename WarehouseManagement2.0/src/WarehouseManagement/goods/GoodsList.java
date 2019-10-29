package WarehouseManagement.goods;

public class GoodsList {
    private Goods[] goods = new Goods[100];
    private int size;

    public GoodsList() {
        goods[0] = new Goods("农夫山泉",2,"饮品",10);
        goods[1] = new Goods("冰红茶",3,"饮品",20);
        goods[2] = new Goods("统一方便面",3,"食品",40);
        this.size = 3;
//        this.goods = goods;
//        //this.size = 1;
//        this.size = size;
    }

    public Goods getGoods(int index) {
        return goods[index];
    }

    public void setGoods(int index, Goods goods) {
        this.goods[index] = goods;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
