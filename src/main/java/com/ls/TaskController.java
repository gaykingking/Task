package com.ls;

import com.ls.dao.TaskMapper;
import com.ls.entity.ConfineDataCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author v_lingsheng
 * @date 2023/5/24 20:25
 */
@Component
public class TaskController {
    @Autowired
    private TaskMapper taskMapper;
    @PostConstruct
    @Transactional(rollbackFor = Exception.class)
    public void test1(){
        //查处confine_data_check中dept_code1为空的异常数据的核查人部门编码
        Set<String> departmentCodes= taskMapper.getCode1IsNull();
        //根据核查人部门编码查询sys_dept表的dept_code1,dept_code2,dept_code3,dept_code4,dept_code5
        Set<ConfineDataCheck> confineDataChecks=taskMapper.getDeptCodeByCodes(departmentCodes);
        //过滤空的数据
        Set<ConfineDataCheck> collect = confineDataChecks.stream().filter(confineDataCheck -> confineDataCheck != null).collect(Collectors.toSet());
        //批量更新这些dept_code1为空的数据，dept_code1,2,3,4,5全都更新完整
        taskMapper.updateConfineDataCheck(collect);
        System.out.println("执行成功");
    }
}
