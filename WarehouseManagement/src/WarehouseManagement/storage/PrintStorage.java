package WarehouseManagement.storage;

import WarehouseManagement.goods.GoodsList;

public class PrintStorage implements IStorage {
    @Override
    public void work(GoodsList goodsList) {
        System.out.println("������л�����Ϣ");
        for (int i = 0; i < goodsList.getSize(); i++) {
            System.out.println(goodsList.getGoods(i));
        }
        System.out.println("���� " +goodsList.getSize()+ " �ֻ���");
    }
}
