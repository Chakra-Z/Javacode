package WarehouseManagement.user;

import WarehouseManagement.goods.GoodsList;
import WarehouseManagement.storage.IStorage;

public class User {
    protected String name;
    protected String ID;
    protected IStorage[] iStorages;

    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void changeStorage(int choice, GoodsList goodsList) {
        iStorages[choice].work(goodsList);
    }
}
