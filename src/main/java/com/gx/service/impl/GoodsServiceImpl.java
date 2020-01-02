package com.gx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gx.entity.Goods;
import com.gx.mapper.GoodsMapper;
import com.gx.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
