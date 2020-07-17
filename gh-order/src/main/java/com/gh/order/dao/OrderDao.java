package com.gh.order.dao;

import com.gh.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xxx
 * @email xxx
 * @date 2020-07-13 16:52:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
