package com.zstu.fruit.service.impl;

import com.zstu.fruit.dao.FruitDAO;
import com.zstu.fruit.pojo.Fruit;
import com.zstu.fruit.service.FruitService;
import com.zstu.myssm.basedao.ConnUtil;

import java.util.List;

/**
 * ClassName: FruitServiceImpl
 * Package: com.zstu.fruit.service.impl
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 9:28
 * @Version: v1.0
 */
public class FruitServiceImpl implements FruitService {

    private FruitDAO fruitDAO = null;

    @Override
    public List<Fruit> getFruitList(String keyword, Integer pageNum) {
        System.out.println("getFruitList -> " + ConnUtil.getConn());
        return fruitDAO.getFruitList(keyword, pageNum);
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruitDAO.addFruit(fruit);
    }

    @Override
    public Fruit getFruitByFid(Integer fid) {
        return fruitDAO.getFruitByFid(fid);
    }

    @Override
    public void delFruit(Integer fid) {
        fruitDAO.delFruit(fid);
    }

    @Override
    public Integer getPageCount(String keyword) {
        System.out.println("getFruitList -> " + ConnUtil.getConn());
        int count = fruitDAO.getFruitCount(keyword);
        int pageCount = (count+5-1)/5 ;
        return pageCount;
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitDAO.updateFruit(fruit);
    }
}
