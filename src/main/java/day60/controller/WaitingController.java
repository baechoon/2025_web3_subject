package day60.controller;

import day60.model.dto.WaitingDto;
import day60.service.WaitingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WaitingController {
    @Autowired private WaitingService waitingService;

//http://localhost:8080/signup.do
//{ "wphone":"010-0000-0000",
// "wpeople":"2"
//}
    @PostMapping("/signup.do")
    public boolean signUp(@RequestBody WaitingDto waitingDto){
        boolean result=waitingService.signUp(waitingDto);
        return result;
    }

    //http://localhost:8080/list.do

//{
//"wno": 1,
//"wphone": "010-0000-0000",
//"wpeople": 2
//}

    @GetMapping("/list.do")
    public ArrayList<WaitingDto>list(){
        ArrayList<WaitingDto>result=waitingService.list();
        return result;
    }
}
