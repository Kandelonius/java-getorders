package com.lambdashane.javaorders.controllers;

import com.lambdashane.javaorders.services.AgentServices;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/agents")
public class AgentController
{

    @Autowired
    private AgentServices agentServices;

    //    http://localhost:2019/agents/agent/9

}
