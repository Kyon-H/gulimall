package com.atlxc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 16:30:40
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

