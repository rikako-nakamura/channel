package com.rikako.techpit.chat.chatbackend.app.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rikako.techpit.chat.chatbackend.domain.hello.model.channels.model.Channel;

@RestController
@RequestMapping("/channels")
@CrossOrigin
public class ChannelController {
  @PostMapping()
  public Channel create(@RequestBody Channel channel){
    return channel;
  }

  @GetMapping()
  public List<Channel> findAll(){
    //TODO: Serviceを作成するまでは暫定的にからのリストを返却
    return Collections.emptyList();
  }

}
