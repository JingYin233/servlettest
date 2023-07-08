package com.zstu.fruit.service;

import com.zstu.fruit.pojo.Fruit;

import java.util.List;

/**
 * ClassName: FruitService
 * Package: com.zstu.fruit.service
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 9:21
 * @Version: v1.0
 */

public interface FruitService {
    //获取指定的库存列表信息
    List<Fruit> getFruitList(String keyword, Integer pageNum);
    //添加库存记录信息
    void addFruit(Fruit fruit);
    //根据id查看指定库存记录
    Fruit getFruitByFid(Integer fid);
    //删除特定库存记录
    void delFruit(Integer fid);
    //获取总页数
    Integer getPageCount(String keyword);
    //修改特定库存记录
    void updateFruit(Fruit fruit);
}
