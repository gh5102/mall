package com.gh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

