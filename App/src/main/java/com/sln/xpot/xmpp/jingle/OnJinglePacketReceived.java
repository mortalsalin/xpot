package com.sln.xpot.xmpp.jingle;

import com.sln.xpot.entities.Account;
import com.sln.xpot.xmpp.PacketReceived;
import com.sln.xpot.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	public void onJinglePacketReceived(Account account, JinglePacket packet);
}
