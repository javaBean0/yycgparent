package yycg.sql.select;

import org.apache.ibatis.jdbc.SQL;
import org.junit.Test;
import yycg.base.domain.Sysuser;

/**
 * Created with IDEA
 * author:bigStone
 * Date:2019/5/1
 **/
public class GeneratorSql {


    public String findUserById(Sysuser sysuser) {
        return new SQL(){{
            SELECT("id,name");
            SELECT("other");
            FROM("user");
            if(sysuser.getId()!=null){
                WHERE("id = #{id}");
            }
            if(sysuser.getUsername()!=null){
                WHERE("name = #{name}");
            }
            //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
        }}.toString();
    }


    @Test
    public void testSelect(){
        Sysuser sysuser = new Sysuser();
        sysuser.setId("123");
        sysuser.setUsername("zhangfei");
        String sql = findUserById(sysuser);
        System.out.println(sql);

    }


    @Test
    public void testString() {

        SQL sql = new SQL();
        sql.SELECT("id");
        sql.SELECT("name");
        sql.FROM("user");
        sql.WHERE("id = #{id}");
        String str = sql.toString();
        System.out.println(str);

    }



}
