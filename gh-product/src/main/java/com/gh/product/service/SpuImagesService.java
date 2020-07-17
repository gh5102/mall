package com.gh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

