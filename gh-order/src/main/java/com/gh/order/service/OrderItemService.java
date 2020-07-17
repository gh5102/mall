package com.gh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 16:52:49
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

