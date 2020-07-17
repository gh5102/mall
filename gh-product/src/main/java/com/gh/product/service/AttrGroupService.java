package com.gh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

