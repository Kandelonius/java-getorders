package com.lambdashane.javaorders.controllers;

import com.lambdashane.javaorders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agents")
public class AgentController
{

    @Autowired
    private AgentServices agentServices;

    //    http://localhost:2019/agents/agent/9
}
