package com.gh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

