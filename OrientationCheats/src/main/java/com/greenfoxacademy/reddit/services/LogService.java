package com.greenfoxacademy.reddit.services;
import java.util.List;

import com.greenfoxacademy.reddit.models.Log;
import com.greenfoxacademy.reddit.models.dtos.LogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenfoxacademy.reddit.repos.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LogService {

    private LogRepository logRepository;


    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }
//    @Override
    public void createLog(String endpoint, String data) {
        Log log = new Log(endpoint, data);
        logRepository.save(log);
    }
//    @Override
    public List<Log> listAllLog(){
        return logRepository.findAll();
    }
//    @Override
    public int logCounter(){
        return logRepository.findAll().size();
    }
//    @Override
    public LogDto logDto(){
        return new LogDto(listAllLog(),logCounter());
    }
}

