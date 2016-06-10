package Test1;

public class UserDAO {
public boolean isvalidcredentials(String User_ID, String password){
	if (User_ID.equals("NIIT")&& password.equals("NIIT@123")){
		return true;
			}
	else{
		return false;
	}
}
}
