import java.util.HashMap;

import com.cg.beans.Account;
import com.cg.repo.repo;
import com.cg.repo.repo_interfaces;
import com.cg.service.Service_interface;
import com.cg.service.service;

public class main 
{
	public static void main(String[] args) throws Exception {
		HashMap<Integer,Account> accountList = new HashMap<Integer,Account>();
		repo_interfaces repo = new repo(accountList);
		Service_interface service = new service(repo);
		
		
		System.out.println(service.creatAccount(1233, "fawwaf", 9000));
		System.out.println(service.creatAccount(3213, "arul", 9876));
		System.out.println(service.creatAccount(2333, " ", 9000));
		System.out.println(service.creatAccount(3343, "roy", 3432));
		System.out.println(service.creatAccount(1233, "eded", 9000));


		


}
}
