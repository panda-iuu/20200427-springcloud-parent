package com.aaa.lifuju.springcloud.mapper;



import com.aaa.lifuju.springcloud.model.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}