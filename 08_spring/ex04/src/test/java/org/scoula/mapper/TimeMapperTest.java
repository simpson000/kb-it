package org.scoula.mapper;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.*;
@Log4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)

class TimeMapperTest {
    @Autowired
    private TimeMapper timeMapper;
    @Test
    void getTime() {
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());

    }
    @Test
    void getTime2() {
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime2());

    }
}