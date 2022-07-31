package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Always
 * @since 2022-07-31
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
