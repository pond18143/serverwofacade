/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

public class ServerWOFacade {
	public static void main(String[] args) {
		myFacade obj = myFacade.getMyServerWOFacade();
		System.out.println("Start working......");
		obj.startServer();
		System.out.println("After work done.........");
		obj.destoryServer();
	}

}
