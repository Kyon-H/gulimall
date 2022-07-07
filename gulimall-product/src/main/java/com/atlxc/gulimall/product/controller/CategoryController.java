package com.atlxc.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atlxc.gulimall.product.entity.CategoryEntity;
import com.atlxc.gulimall.product.service.CategoryService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.common.utils.R;



/**
 * 商品三级分类
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-02 17:08:37
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类以及子分类，以树形结构组装
     */
    @RequestMapping("/list/tree")
    public R list(){
        List<CategoryEntity> entites=categoryService.listWithTree();

        return R.ok().put("data", entites);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * @RequestBody 获取请求体，必须发送POST请求
     * SpringMVC 自动将请求体数据（json），转为对应的对象
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        //1 检查当前删除菜单是否被引用
		categoryService.removeMenuByIds(Arrays.asList(catIds));


        return R.ok();
    }

}
