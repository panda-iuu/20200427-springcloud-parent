package com.aaa.lifuju.springcloud.controller;

import com.aaa.lifuju.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud.controller
 * @ClassName: BookController
 * @Author: lifuju
 * @Description:
 * @Date: 2020/4/28 9:37
 * @Version: 1.0
 */
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/bookAll")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}
