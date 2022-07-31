package com.example.demo.service.impl;

import com.example.demo.entity.Record;
import com.example.demo.mapper.RecordMapper;
import com.example.demo.service.IRecordService;
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
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements IRecordService {

}
