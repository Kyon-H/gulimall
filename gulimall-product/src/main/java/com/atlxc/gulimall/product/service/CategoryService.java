package com.atlxc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-02 15:53:34
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

