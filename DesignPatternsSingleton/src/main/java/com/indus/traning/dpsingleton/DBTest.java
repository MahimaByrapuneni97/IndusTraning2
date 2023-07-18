/*
 * @author 
 */
package com.indus.traning.dpsingleton;

import java.io.ObjectInputStream.GetField;

public class DBTest {

	public static void main(String[] args) {
		DBConnection conn = DBConnection.getConn();
		/*
		 * String userName; String password; String dbUrl;
		 * 
		 * userName = args[0]; password = args[1]; dbUrl = args[2];
		 

		DBConnection dbconn = DBConnection.getConn();
		DBConnection dbconn1 = DBConnection.getConn();

		// System.out.println("Hello " + args[0] + " " + args[1] + " " + args[2]);
		System.out.println(dbconn);
		System.out.println(dbconn.hashCode());
		System.out.println(dbconn1);
		System.out.println(dbconn1.hashCode());

		// System.out.println(dbconn.getUserName());*/
	}

}
