/*
 * package com.example.app.service;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.example.app.model.policy;
 * 
 * import com.example.app.repository.policyrepo; import
 * com.example.app.vo.Emigrant; import com.example.app.vo.Passport; import
 * com.example.app.vo.responsevo;
 * 
 * @Service public class policyservice {
 * 
 * @Autowired Emigrantrepo repo;
 * 
 * @Autowired RestTemplate restTemplate;
 * 
 * @Autowired policyrepo repo1;
 * 
 * 
 * 
 * public responsevo getuserwithdetailsofpolicy(int passportnumber,int
 * durationinyears,String vendor) { responsevo response=new responsevo();
 * 
 * 
 * Emigrant emi=repo.findbypassportno(passportno);
 * 
 * System.out.println(emi);
 * 
 * 
 * Emigrant e=restTemplate.getForObject(
 * "http://10.210.7.65:9191/emigrant/getEmigrantbypassport/"+passportnumber,
 * Emigrant.class); policy
 * p=repo1.getpolicybydurationandvendor(durationinyears,vendor);
 * System.out.println(e); response.setEmigrant(e); response.setPolicy(p); return
 * response;
 * 
 * 
 * }
 * 
 * 
 * public List<policy> getallpolicy() { // TODO Auto-generated method stub
 * List<policy>policies=repo1.findAll(); System.out.println(policies); return
 * policies; }
 * 
 * 
 * public String checkapi() { // TODO Auto-generated method stub
 * System.out.println("in checkapi"); //String
 * test=restTemplate.getForObject("http://localhost:8081/emigrant/apitest",
 * String.class); return "reached in policy api"; }
 * 
 * 
 * 
 * 
 * }
 */