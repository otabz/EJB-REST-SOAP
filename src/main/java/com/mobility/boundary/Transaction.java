package com.mobility.boundary;

import java.math.BigInteger;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import com.waseel.InteractionCT;
import com.waseel.MessageHeaderCT;
import com.waseel.TransactionCT;
import com.waseel.TransactionDirectionST;
import com.waseel.TransactionSubTypeST;
import com.waseel.TransactionTypeST;
import com.waseel.UserCT;

public class Transaction {

	protected MessageHeaderCT createHeader(GregorianCalendar timeStamp,
			String provider, String payer, TransactionTypeST type, TransactionSubTypeST subType)
			throws DatatypeConfigurationException {
		MessageHeaderCT header = new MessageHeaderCT();
		header.setInteraction(new InteractionCT());
		header.getInteraction().setInteractionCode(BigInteger.valueOf(101));
		header.getInteraction().setReceiverCode(payer);// creds.getCard().getPayer());
		header.getInteraction().setSenderCode(provider);
		header.setTimestamp(DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(timeStamp));
		header.setTransaction(new TransactionCT());
		header.getTransaction().setType(type);// TransactionTypeST.VALUE_1);
		header.getTransaction().setSubType(subType);
		header.getTransaction().setDirection(TransactionDirectionST.REQUEST);
		header.setUser(new UserCT());
		//header.getUser().setLogin("mobuser");
		//header.getUser().setPassword("fvnhh789");
		//-header.getUser().setLogin("hmc1test");
		//-header.getUser().setPassword("1234");
		/** last **/
		header.getUser().setLogin("ford");
		header.getUser().setPassword("fiesta");
		/** **/
		/** given by hashim devzero **/
		//header.getUser().setLogin("dlhadmin");
		//header.getUser().setPassword("dlhclm");
		//header.getUser().setLogin("mobility");
		//header.getUser().setPassword("8W@seel");
		return header;
	}
}
