package yycg.base.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.domain.BssSysArea;
import yycg.base.domain.BssSysAreaExample;

import java.util.List;

public interface BssSysAreaMapper {
    int countByExample(BssSysAreaExample example);

    int deleteByExample(BssSysAreaExample example);

    int deleteByPrimaryKey(String areaid);

    int insert(BssSysArea record);

    int insertSelective(BssSysArea record);

    List<BssSysArea> selectByExample(BssSysAreaExample example);

    BssSysArea selectByPrimaryKey(String areaid);

    int updateByExampleSelective(@Param("record") BssSysArea record, @Param("example") BssSysAreaExample example);

    int updateByExample(@Param("record") BssSysArea record, @Param("example") BssSysAreaExample example);

    int updateByPrimaryKeySelective(BssSysArea record);

    int updateByPrimaryKey(BssSysArea record);
}