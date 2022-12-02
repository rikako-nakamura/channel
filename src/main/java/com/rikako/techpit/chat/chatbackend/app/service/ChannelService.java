package com.rikako.techpit.chat.chatbackend.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rikako.techpit.chat.chatbackend.domain.hello.model.channels.model.Channel;
import com.rikako.techpit.chat.chatbackend.domain.hello.service.ChannelDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ChannelService {

  private final ChannelDomainService channelDomainService;

  public Channel create(Channel channel){
    return channelDomainService.create(channel);
  }
  
  public List<Channel> findAll(){
    return channelDomainService.findAll();
  }
}
