package com.gh.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 16:43:25
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

