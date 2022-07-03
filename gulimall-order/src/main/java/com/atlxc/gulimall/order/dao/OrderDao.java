package com.atlxc.gulimall.order.dao;

import com.atlxc.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 16:18:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
