package WarehouseManagement.goods;

public class GoodsList {
    private Goods[] goods = new Goods[100];
    private int size;

    public GoodsList(Goods[] goods, int size) {
        //goods[0] = new Goods("农夫山泉",2,"饮料",10);
        this.goods = goods;
        //this.size = 1;
        this.size = size;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
