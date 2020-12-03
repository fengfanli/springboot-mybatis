package com.feng.utils;

import com.feng.vo.resp.PageRespVo;
import com.github.pagehelper.Page;

import java.util.List;

public class PageUtil {
    public PageUtil() {
    }

    public static <T> PageRespVo<T> getPageVO(List<T> list){
        PageRespVo<T> respVo = new PageRespVo<>();

        if (list instanceof Page) {
            Page page = (Page) list; // 将结果集 list 强转为 page 对象，则
            respVo.setTotalRows(page.getTotal()); // 总记录数
            respVo.setTotalPages(page.getPages());
            respVo.setNowPageNum(page.getPageNum());// 当前页数
            respVo.setCurPageSize(page.getPageSize());// 当前页 记录数
            respVo.setPageSize(page.size()); // 每页 记录数
            respVo.setDataList(page.getResult()); // 数据 列表
        }

        return respVo;
    }
}
