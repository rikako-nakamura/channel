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

import com.rikako.techpit.chat.chatbackend.app.service.ChannelService;
import com.rikako.techpit.chat.chatbackend.domain.hello.model.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/channels")
@CrossOrigin
public class ChannelController {

  private final ChannelService channelService;
  @PostMapping()
  public Channel create(@RequestBody Channel channel){
    return channelService.create(channel);
  }

  @GetMapping()
  public List<Channel> findAll(){
    return channelService.findAll();
  }

}
