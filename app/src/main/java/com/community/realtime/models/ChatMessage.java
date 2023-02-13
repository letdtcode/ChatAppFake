package com.community.realtime.models;

import java.util.Date;

public class ChatMessage{
    public String senderId, receiverId, message, dateTime;
    public Date dateObject;

//    @Override
//    public int compareTo(ChatMessage o) {
//        return this.dateObject.compareTo(o.dateObject);
//    }
}
