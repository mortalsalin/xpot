package com.sln.xpot.xmpp;

import com.sln.xpot.entities.Account;
import com.sln.xpot.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
