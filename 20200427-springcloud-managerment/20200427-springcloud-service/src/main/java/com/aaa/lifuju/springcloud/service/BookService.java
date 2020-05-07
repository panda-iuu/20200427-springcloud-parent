package com.aaa.lifuju.springcloud.service;

import com.aaa.lifuju.springcloud.mapper.BookMapper;
import com.aaa.lifuju.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud.service
 * @ClassName: BookService
 * @Author: lifuju
 * @Description: 11
 * @Date: 2020/4/28 9:20
 * @Version: 1.0
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
