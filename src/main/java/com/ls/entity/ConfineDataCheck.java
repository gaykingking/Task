package com.ls.entity;

import java.util.Objects;

/**
 * @author v_lingsheng
 * @date 2023/5/29 16:14
 */
public class ConfineDataCheck {
    private String department_code;
    private Long dept_code1;
    private Long dept_code2;
    private Long dept_code3;
    private Long dept_code4;
    private Long dept_code5;

    public String getDepartment_code() {
        return department_code;
    }

    @Override
    public String toString() {
        return "ConfineDataCheck{" +
                "department_code='" + department_code + '\'' +
                ", dept_code1=" + dept_code1 +
                ", dept_code2=" + dept_code2 +
                ", dept_code3=" + dept_code3 +
                ", dept_code4=" + dept_code4 +
                ", dept_code5=" + dept_code5 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfineDataCheck that = (ConfineDataCheck) o;
        return Objects.equals(department_code, that.department_code) && Objects.equals(dept_code1, that.dept_code1) && Objects.equals(dept_code2, that.dept_code2) && Objects.equals(dept_code3, that.dept_code3) && Objects.equals(dept_code4, that.dept_code4) && Objects.equals(dept_code5, that.dept_code5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_code, dept_code1, dept_code2, dept_code3, dept_code4, dept_code5);
    }
}
