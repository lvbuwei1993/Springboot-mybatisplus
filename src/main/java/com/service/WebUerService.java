package com.service;

import com.entity.WebUser;
import com.util.PageBean;

import java.util.List;

/**
 * Created by lvhong on 2019/2/25.
 */
public interface WebUerService {
    WebUser selectByPrimaryKey(Long fId);

    PageBean selectUserList(PageBean pageBean);

    void insrtList(List<WebUser> webUsers);

    List<WebUser> selectUserLists();
}
