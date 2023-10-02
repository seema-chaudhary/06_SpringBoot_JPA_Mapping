package com.codewithseema;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codewithseema.entity.Address;
import com.codewithseema.entity.Category;
import com.codewithseema.entity.Emp;
import com.codewithseema.entity.Mobile;
import com.codewithseema.entity.Product;
import com.codewithseema.repository.AddressRepo;
import com.codewithseema.repository.CategoryRepo;
import com.codewithseema.repository.EmpRepo;
import com.codewithseema.repository.MobileRepo;
import com.codewithseema.repository.ProductRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private MobileRepo mobRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	@Autowired
	private ProductRepo prodRepo;
	
	@Autowired
	private CategoryRepo catRepo; 
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//creating data uniDirectional One to One**************************************************
//		Emp emp = new Emp();
//		emp.setEmpName("Soni");
//		
//		Mobile mob = new Mobile();
//		mob.setMobileName("iPhone 15");
//		
//		emp.setMobile(mob);
//				
//		empRepo.save(emp);
//		mobRepo.save(mob);		
//		System.out.println("Saved Successfully!!!");
		
//		Printing Detail using Emp uniDirectional 
//		Emp emp = empRepo.findById(2).get();
//		System.out.println("Id : " + emp.getId());
//		System.out.println("Name : "+  emp.getEmpName());
//		System.out.println("Mobile : "+emp.getMobile().getMobileName());
		
		
		//creating data using Bidirectional ****************************************
//				Emp emp = new Emp();
//				emp.setEmpName("Abhi");
//				
//				Mobile mob = new Mobile();
//				mob.setMobileName("iPhone 14");
//				
//				mob.setEmp(emp);
//				
//				empRepo.save(emp);
//				mobRepo.save(mob);				
//				System.out.println("Saved Successfully!!!");
				
				
//				Printing Detail using Mobile BiDirectional 	
//				Mobile mob = mobRepo.findById(2).get();
//				System.out.println("Mobile Id : " + mob.getId());
//				System.out.println("Mobile Name : "+  mob.getMobileName());
//				System.out.println("Employee name : "+ mob.getEmp().getEmpName());
		
//		OneToMany  ManyToOne **************************************************************************************
//		Emp emp = new Emp();
//		emp.setEmpName("Seema");
//		
//		Address ad = new Address();
//		ad.setAddress("New Delhi");
//		ad.setType("Permanent");
//		ad.setEmp(emp);
//		
//		Address ad1 = new Address();
//		ad1.setAddress("Baghpat");
//		ad1.setType("Current");
//		ad1.setEmp(emp);
//		
//		List<Address> addList = Arrays.asList(ad,ad1);
//		emp.setAddress(addList);
//		
//		empRepo.save(emp);
//		System.out.println("Emp and Address save Successfully!!!!!");
		
//		Fetaching Data One to Many using Employee UniDirectional
//		Emp emp = empRepo.findById(7).get();
//		System.out.println("Emp Name :"+ emp.getEmpName());
//		emp.getAddress().forEach(e->System.out.println(e.getAddress()+" = "+ e.getType()));
		
//		Fetaching Data One to Many using Address BiDirectional
//		Address ad = addRepo.findById(3).get();
//		System.out.println("Address = "+ ad.getAddress());
//		System.out.println("Emp Name = "+ ad.getEmp().getEmpName());
		
		
//		Creating data using ManyToMany **************************************************************************
		
//		Category c1 = new Category();
//		c1.setCategoryName("Electronics");
//		
//		Category c2 = new Category();
//		c2.setCategoryName("Mobile");
//		
//		Product p1 = new Product();
//		p1.setProductName("TV");
//		
//		Product p2 = new Product();
//		p2.setProductName("Oneplus Mobile");
//		
//		Product p3 = new Product();
//		p3.setProductName("iPhone 14");
//		
//		c1.getProduct().add(p1);
//		c1.getProduct().add(p2);
//		c1.getProduct().add(p3);
//		
//		c2.getProduct().add(p2);
//		c2.getProduct().add(p3);
//		
//		p1.getCategory().add(c1);
//		p2.getCategory().add(c1);
//		p3.getCategory().add(c1);
//		
//		p2.getCategory().add(c2);
//		p3.getCategory().add(c2);
//		
//		catRepo.save(c1);
//		catRepo.save(c2);
//		
//		System.out.println("Saved.......");
		
//		Fetaching Data ManyToMany using Category BiDirectional
//		Category ca = catRepo.findById(2).get();
//		System.out.println(ca.getCategoryName());
//		ca.getProduct().forEach(e->System.out.println(e.getProductName()));

//		Fetaching Data ManyToMany using Product BiDirectional
		Product prod = prodRepo.findById(2).get();
		System.out.println(prod.getProductName());
		prod.getCategory().forEach(e->System.out.println(e.getCategoryName()));
	}

}
