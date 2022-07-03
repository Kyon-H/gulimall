package com.atlxc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 15:34:33
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

