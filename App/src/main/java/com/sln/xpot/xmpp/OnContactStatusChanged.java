package com.sln.xpot.xmpp;

import com.sln.xpot.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
