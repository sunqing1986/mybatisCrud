package com.qf.mybatis.pojo;

public class Student   {
    private Integer stuid;

    private String stuName;

    private Integer stuatclass;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuatclass() {
        return stuatclass;
    }

    public void setStuatclass(Integer stuatclass) {
        this.stuatclass = stuatclass;
    }

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuName=" + stuName + ", stuatclass=" + stuatclass + "]";
	}
    
}