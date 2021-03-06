package com.avgmoney.app.logic;

import java.util.List;

import android.content.Context;

import com.avgmoney.app.AvgMoneyApplication;
import com.avgmoney.app.db.AvgMoneyDb;
import com.avgmoney.app.model.CommodityType;

public class CommodityTypeLogic {

    private AvgMoneyDb db;

    public CommodityTypeLogic(Context context) {
        db = ((AvgMoneyApplication) context.getApplicationContext()).getDb();
    }

    public void addCommodityType(CommodityType c) {
        db.saveCommodityType(c);
    }

    public List<CommodityType> queryCommodityType() {
        return db.getCommodityTypes();
    }

    public CommodityType getDefaultType() {
        List<CommodityType> types = db.getCommodityTypes();
        if (types != null && types.size() > 0) {
            return types.get(0);
        }
        return null;
    }

}
