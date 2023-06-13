package com.Dashank.service;

import java.util.List;

import com.Dashank.exception.ChatException;
import com.Dashank.exception.MessageException;
import com.Dashank.exception.UserException;
import com.Dashank.model.Message;
import com.Dashank.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
