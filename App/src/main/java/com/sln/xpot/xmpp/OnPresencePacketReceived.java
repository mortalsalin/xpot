package com.sln.xpot.xmpp;

import com.sln.xpot.entities.Account;
import com.sln.xpot.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
