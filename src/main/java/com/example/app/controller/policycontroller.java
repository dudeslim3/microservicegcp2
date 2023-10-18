package com.example.app.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.app.proxy.dmsproxy;
import com.example.app.proxy.emigrantproxy;
/*import com.example.app.service.policyservice;
import com.example.app.vo.Passport;
import com.example.app.vo.responsevo;*/

@RestController
@RequestMapping("/policy")
@CrossOrigin(origins="*",allowedHeaders = "Access-Control-Allow-Origin")
public class policycontroller
{
	/*
	 * @Autowired policyservice serv;
	 * 
	 * @Autowired emigrantproxy serv1;
	 * 
	 * @Autowired dmsproxy serv2;
	 */
	
	/*
	 * @GetMapping("/getallpolicy") //@RolesAllowed("Emigrant")//onlu emigrant user
	 * can see the all policies public List<policy> getallpolicies() { return
	 * serv.getallpolicy(); }
	 * 
	 * 
	 * 
	 * 
	 * @PostMapping("/policybuy/{passport_number}/{duration}/{vendor}") public
	 * responsevo getuserwithdetailsofpolicy(@PathVariable ("passport_number")int
	 * passportnumber,@PathVariable ("duration")int durationinyears,@PathVariable
	 * ("vendor")String vendor) {
	 * 
	 * Log log = LogFactory.getLog(getClass()); log.info(passportnumber);
	 * System.out.println(passportnumber); System.out.println(durationinyears);
	 * System.out.println(vendor);
	 * 
	 * return
	 * serv.getuserwithdetailsofpolicy(passportnumber,durationinyears,vendor); }
	 */
	
	
	@GetMapping("/checkapi")
	public String testapi()
	{
		System.out.println("reached in second service");
		//String response=serv2.test();
		//System.out.println("in testapi"+response);
		return "hiii from second service ";
	}
	

}
