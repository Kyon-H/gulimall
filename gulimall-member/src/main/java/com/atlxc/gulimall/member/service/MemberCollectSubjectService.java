package com.atlxc.gulimall.member.service;

import com.atlxc.common.utils.PageUtils;
import com.atlxc.gulimall.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-03 15:47:03
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

