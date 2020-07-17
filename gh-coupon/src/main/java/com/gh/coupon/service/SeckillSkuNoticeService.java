package com.gh.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 16:43:25
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

