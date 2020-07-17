package com.gh.product.dao;

import com.gh.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xxx
 * @email xxx
 * @date 2020-07-13 15:34:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
