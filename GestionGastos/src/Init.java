
public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();

		
		
		String account = AccountManagment.createAccount(userToCreateAccount);
		
		//System.out.println(account);
		
		String user = Utils.fromStringToUser (account);
		String email = Utils.fromStringToEmail (account);
		String password = Utils.fromStringToPassword (account);
		
		boolean  isValidated  =  Login.validateAccount (reader, user, password);
		
		if (isValidated) {
			
			
			user = AccountUpdating.updateUser(reader, user);
			email = AccountUpdating.updateEmail(reader, email);
			password = AccountUpdating.updatePasswod(reader, password);
			
			
			//fake deleting ...
			AccountDeleting.deleteAccount(user, email, password);
			
			isValidated = false;
		}
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}

	

}
