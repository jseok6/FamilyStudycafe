package study;

public class ChatProtocol2 {

	//ID, CHAT, CHATALL , MESSAGE, CHATLIST
	
	//(C->S) ID:aaa
	public static final String ID = "ID";
	
	//(C->S) CHAT:�޴¾��̵�;�޼��� ex)CHAT:bbb;�����
	//(S->C) CHAT:�����¾��̵�;�޼��� ex)CHAT:aaa;�����
	public static final String CHAT = "CHAT";
	
	//(C->S) CHATALL:�޼���
	//(S->C) CHATALL:[�����¾��̵�]�޼���
	public static final String CHATALL = "CHATALL";
	
	//(C->S) MESSAGE:�޴¾��̵�;�������� ex)MESSAGE:bbb;�����
	//(S->C) MESSAGE:�����¾��̵�;�������� ex)MESSAGE:aaa;�����
	public static final String MESSAGE = "MESSAGE";
	
	//(S->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";
	
	public static final String ROOMLIST = "ROOMLIST";
	
	public static final String RESETLIST = "RESETLIST";

	public static final String DELETELIST = "DELETELIST";

	public static final String ENTERROOM = "ENTERROOM";
	
	public static final String ADDUSER = "ADDUSER";
	
	public static final String EXIT = "EXIT";
	
	public static final String DELETUSER = "DELETUSER";
}
