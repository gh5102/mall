package com.gh.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gh.common.utils.PageUtils;
import com.gh.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xxx
 * @email xxx
 * @date 2020-07-13 16:59:15
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

