package com.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lvhong on 2019/5/18.
 */
public class PageBean<T> implements Serializable {


    private Integer currentPage = 1;// 当前页

    private Integer pageSize = 10;// 每页量

    private String orderField;// 排序字段，多个字段用","隔开

    private String sort = "DESC";// 排序方式，DESC降序；ASC升序

    private Integer startPage =0;// 分页开始记录条数

    private Integer endPage =10;// 分页开始记录条数

    private Integer total;// 总记录数

    private Integer totalPage;// 总页数

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    private List<T> rows;// 结果数据;
    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        this.startPage = (currentPage-1) * pageSize;
        this.endPage = currentPage * pageSize;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField == null ? null : orderField.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        if (total != null) {
            this.startPage = (this.currentPage - 1) * this.pageSize;
            this.endPage = (this.currentPage  * this.pageSize) <= total ? this.currentPage * this.pageSize : total;
            this.totalPage =  ((total % this.pageSize) == 0 ? (total / this.pageSize)
                    : (total / this.pageSize) + 1);
        }else{
            this.endPage = 0;
        }
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

}
