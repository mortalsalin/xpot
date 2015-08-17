package com.sln.xpot.xmpp.jingle.stanzas;

import com.sln.xpot.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
