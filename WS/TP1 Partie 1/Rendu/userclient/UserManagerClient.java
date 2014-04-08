package org.apache.ws.axis2;

import org.apache.ws.axis2.UserManagerStub.GetUser;
import org.apache.ws.axis2.UserManagerStub.GetUserResponse;
import org.apache.ws.axis2.UserManagerStub.ListUsers;
import org.apache.ws.axis2.UserManagerStub.ListUsersResponse;
import org.apache.ws.axis2.UserManagerStub.User;






public class UserManagerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		UserManagerStub stub = new UserManagerStub(
				"http://localhost:8080/user/services/UserManager");

		// Exemple de recherche d'un utilisateur avec son email
		GetUser requestuser = new GetUser();
		requestuser.setEmail("user1@gmail.com");
		
		GetUserResponse response = stub.getUser(requestuser);
		User user = response.get_return();
		System.out.println("Get user :");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " "
				+ user.getEmail());
		System.out.println("");

		// Exemple d affichage d'un liste d'utilisateur
		ListUsers requestlist = new ListUsers();
		ListUsersResponse responselist = stub.listUsers(requestlist);
		User[] list = responselist.get_return();
		System.out.println("List user :");
		for (int i = 0; i < list.length; i++) {
			User userfromlist = list[i];
			System.out.println(userfromlist.getFirstName() + " " + userfromlist.getLastName()
					+ " " + userfromlist.getEmail());

		}
	}

}
