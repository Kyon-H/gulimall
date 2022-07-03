package com.atlxc.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 16:18:41
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

