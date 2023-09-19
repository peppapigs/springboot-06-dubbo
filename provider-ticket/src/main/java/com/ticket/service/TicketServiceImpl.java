package com.ticket.service;


import org.apache.dubbo.config.annotation.DubboService;

@DubboService //将扫描的服务服务发布出去--->到配置的zookeeper注册中心
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "<龙猫>";
    }
}
