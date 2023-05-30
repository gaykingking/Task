package com.ls.dao;

import com.ls.entity.ConfineDataCheck;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author v_lingsheng
 * @date 2023/5/24 20:34
 */
@Component
public interface TaskMapper {
    @Select("select distinct department_code from confine_data_check where dept_code1 is null")
    Set<String> getCode1IsNull();
    Set<ConfineDataCheck> getDeptCodeByCodes(@Param("list") Set<String> departmentCodes);
    Integer updateConfineDataCheck(@Param("set") Set<ConfineDataCheck> confineDataChecks);
}
