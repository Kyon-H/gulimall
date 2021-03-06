package com.atlxc.gulimall.member.service.impl;

import com.atlxc.common.utils.PageUtils;
import com.atlxc.common.utils.Query;
import com.atlxc.gulimall.member.dao.MemberStatisticsInfoDao;
import com.atlxc.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.atlxc.gulimall.member.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new Query<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<MemberStatisticsInfoEntity>()
        );

        return new PageUtils(page);
    }

}