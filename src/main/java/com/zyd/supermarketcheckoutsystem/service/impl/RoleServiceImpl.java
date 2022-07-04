package com.zyd.supermarketcheckoutsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyd.supermarketcheckoutsystem.pojo.Role;
import com.zyd.supermarketcheckoutsystem.service.RoleService;
import com.zyd.supermarketcheckoutsystem.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 86183
* @description 针对表【role】的数据库操作Service实现
* @createDate 2022-04-11 16:56:59
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
implements RoleService{

}
