package day60.service;

import day60.model.dao.WaitingDao;
import day60.model.dto.WaitingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WaitingService {
    @Autowired private WaitingDao waitingDao;

    public boolean signUp(WaitingDto waitingDto){
        boolean result=waitingDao.signUp(waitingDto);
        return result;
    }

    public ArrayList<WaitingDto>list(){
        ArrayList<WaitingDto>result=waitingDao.list();
        return result;
    }
}
