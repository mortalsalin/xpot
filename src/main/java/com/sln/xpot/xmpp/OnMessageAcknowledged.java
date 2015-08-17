package com.sln.xpot.xmpp;

import com.sln.xpot.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
