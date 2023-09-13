package com.mufeng.backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mufeng.backend.mapper.ChartMapper;
import com.mufeng.backend.service.ChartService;
import org.springframework.stereotype.Service;
import com.mufeng.backend.model.entity.Chart;
/**
* @author lenovo
* @description 针对表【chart(图表)】的数据库操作Service实现
* @createDate 2023-09-13 22:15:12
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}




