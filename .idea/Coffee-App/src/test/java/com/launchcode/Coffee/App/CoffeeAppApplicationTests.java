package com.launchcode.Coffee.App;


import com.launchcode.Coffee.*;
import Models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.launchcode.Coffee.App.*;

@SpringBootTest
class CoffeeAppApplicationTests {


	NewUser new_User_1;
	NewUser new_User_2;
	NewUser new_User_3;
	NewUser new_User_4;
	NewUser new_User_5;
	NewUser new_User_6;
	NewUser new_User_7;




	@BeforeEach
	public void setUp(){
		new_User_1 = new NewUser("Izzy_Macchiato", "isabella_jones@gmail.com", "Izzy", "My favorite things in the world are coffee and cake",
				"iheartcoffee");
		new_User_2 = new NewUser("CoffeeFiend", "Stanley_Smith@yahoo.com", "S.", "Just here to drink that hot bean juice", "Passowrd");
		new_User_3 = new NewUser("I_am_A_Latte", "ashleyAshley@outlook.com", "Ashley", null, "Passowrd" );
		new_User_4 = new NewUser(null, "Stanley_Smith@yahoo.com", "Stan", "I forgot my Username", "whoops");
		new_User_5 = new NewUser("Forgetful_Fred", null, "Freddy", "I forgot my email.", "oopsies");
		new_User_6 = new NewUser("CoffeeFriend", "Friend@gmail.com", "Andy", "I like coffee.", null);
		new_User_7 = new NewUser("I_like_Coffee", "Fred@gmail.com", null, "My name is Fred. I chose to write it here instead.", "BadPassword");
	}



	//Does my UserId generate?
	@Test
	public void generateUserId(){

		Assertions.assertEquals(1, new_User_2.getId() - new_User_1.getId());
	}

	//Can I generate a profile with all information?
	@Test
	public void profileConstructorSetsAllFields(){
		Assertions.assertTrue(new_User_1.getUsername().equals((String) new_User_1.getUsername()));
		Assertions.assertEquals("isabella_jones@gmail.com", new_User_1.getEmail());
		Assertions.assertTrue(new_User_1.getFirstname().equals((String) new_User_1.getFirstname()));
		Assertions.assertEquals("Izzy", new_User_1.getFirstname());
		Assertions.assertEquals("My favorite things in the world are coffee and cake", new_User_1.getAboutme());
		Assertions.assertTrue(new_User_1.getAboutme() instanceof AboutMe);
		Assertions.assertTrue(new_User_1.getPassword().equals((String) new_User_1.getPassword()));
	}

	private void assertTrue(boolean equals) {
	}
	//Can I generate a profile without AboutMe and password?

	@Test
	public void profileConstructorsetsRequiredFields(){
		Assertions.assertTrue(new_User_2.getUsername().equals((String) new_User_2.getUsername()));
		Assertions.assertEquals("CoffeeFiend", new_User_2.getUsername());
		Assertions.assertTrue(new_User_2.getFirstname().equals((String) new_User_2.getFirstname()));
		Assertions.assertEquals("Stan", new_User_2.getFirstname());
		Assertions.assertTrue(new_User_2.getAboutme() instanceof AboutMe);
		Assertions.assertEquals("Stanley_Smith@yahoo.com", new_User_2.getEmail());

	}
	@Test
	public void constructorSetsWithoutFirstname(){
		Assertions.assertTrue(new_User_7.getUsername().equals((String) new_User_7.getUsername()));
		Assertions.assertEquals("I_like_Coffee", new_User_7.getUsername());
		Assertions.assertEquals("Fred@gmail.com", new_User_7.getEmail());
		Assertions.assertTrue(new_User_7.getFirstname.equals(null));
		Assertions.assertTrue(new_User_7.getFirstname.equals(new_User_7.getFirstname()));
		Assertions.assertEquals(null, new_User_7.getFirstname());
		Assertions.assertEquals("My name is Fred. I chose to write it here instead.", new_User_7.getAboutme());
		Assertions.assertTrue(new_User_7.getAboutme() instanceof AboutMe);
		Assertions.assertTrue(new_User_7.getPassword().equals(String) new_User_7.getPassword()));






	}
	@Test
	public void constructorSetsWithoutAboutMe(){
		Assertions.assertTrue(new_User_3.getUsername().equals(String) new_User_3.getUsername()));
		Assertions.assertEquals("I_am_A_Latte", new_User_3.getUsername());
		Assertions.assertEquals("ashleyAshley@outlook.com", new_User_3.getEmail());
		Assertions.assertEquals("Ashley", new_User_3.getFirstname());
		Assertions.assertTrue(new_User_3.getFirstname().equals(String) new_User_3.getFirstname()));
		Assertions.assertTrue(new_User_3.getAboutme().equals(null));
		Assertions.assertTrue(new_User_3.getAboutme() instanceof AboutMe);
		Assertions.assertEquals(null, new_User_1.getAboutme());
		Assertions.assertTrue(new_User_3.getPassword().equals(String) new_User_3.getPassword()));

	}

	//Because the current way I have it set up is not secure, also not what I'd like to do, and too involved to complete right now.
	@Test
	public void constructorSetsWithoutPassword(){

		Assertions.assertTrue(new_User_6.getUsername().equals(String) new_User_6.getUsername()));
		Assertions.assertEquals("CoffeeFriend", new_User_6.getUsername());
		Assertions.assertTrue(new_User_6.getEmail() instanceof UserEmail);
		Assertions.assertEquals("Friend@gmail.com", new_User_6.getEmail());
		Assertions.assertEquals("Friend@gmail.com", new_User_6.UserEmail.getValue());
		Assertions.assertEquals("Andy", new_User_6.getFirstname());
		Assertions.assertTrue(new_User_6.getFirstname().equals(String) new_User_6.getFirstname()));
		Assertions.assertEquals("I like coffee.", new_User_6.getAboutme());
		Assertions.assertTrue(new_User_6.getAboutme() instanceof AboutMe);
		Assertions.assertTrue(new_User_6.getPassword().equals(null));
		Assertions.assertTrue(new_User_6.getPassword.equals(new_User_7.getPassword()));
		Assertions.assertEquals(null, new_User_7.getPassword());




	}



	@Test
	void contextLoads() {
	}


}
