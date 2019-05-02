package yycg.base.service;

import yycg.base.domain.Sysuser;

/**
 * Created with IDEA
 * author:bigStone
 * Date:2019/5/1
 **/
public interface SysuserService {


    Sysuser findSysuserById(String id) throws Exception;
}
