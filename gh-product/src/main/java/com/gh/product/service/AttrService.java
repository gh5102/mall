package com.gh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

