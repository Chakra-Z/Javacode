package WarehouseManagement;

import WarehouseManagement.goods.GoodsList;
import WarehouseManagement.user.Stockist;

public class main {
    public static void main(String[] args){
        GoodsList goodsList = new GoodsList();
        Stockist n = new Stockist("hh","001");
        n.changeStorage(0,goodsList);
        n.changeStorage(1,goodsList);
    }
}
