package com.sln.xpot.xmpp;

import com.sln.xpot.entities.Account;
import com.sln.xpot.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
