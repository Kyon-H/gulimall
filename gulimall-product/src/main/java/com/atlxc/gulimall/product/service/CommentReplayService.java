package com.atlxc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-02 15:53:34
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

