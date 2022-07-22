package com.atlxc.gulimall.ware.service;

import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 16:30:40
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

