package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.domain.Sysuser;
import yycg.base.mapper.SysuserMapper;
import yycg.base.service.SysuserService;

/**
 * 系统用户业务层实现类
 * Created with IDEA
 * author:bigStone
 * Date:2019/5/1
 **/
@Service
public class SysuserServiceImpl implements SysuserService {

    @Autowired
    private SysuserMapper sysuserMapper;

    @Override
    public Sysuser findSysuserById(String id) throws Exception {
        return sysuserMapper.selectByPrimaryKey(id);
    }
}
