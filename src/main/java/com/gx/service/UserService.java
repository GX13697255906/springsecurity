package com.gx.service;

import com.gx.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
public interface UserService extends IService<User> {

    User getUserByUserName(String username);


}
