package com.mapper;

import com.entity.WebUser;
import com.util.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WebUserMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(WebUser record);

    List<WebUser> selectUserList(PageBean pageBean);
    int selectUserListCount(PageBean pageBean);

    int updateByPrimaryKey(WebUser record);
    int insertForeach(List<WebUser> list);

    List<WebUser> selectUserLists();
}