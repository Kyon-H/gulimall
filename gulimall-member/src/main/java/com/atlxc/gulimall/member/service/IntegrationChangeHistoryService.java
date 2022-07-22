package com.atlxc.gulimall.member.service;

import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 15:47:03
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

