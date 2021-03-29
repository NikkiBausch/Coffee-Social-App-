import Models.userProfileCreate.java;
import Models.UserEmail.java;
import Models.AboutMe.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class UserProfiletests{

  NewUser new_User_1;
  NewUser new_User_2;
  NewUser new_User_3;
  NewUser new_User_4;
  NewUser new_User_5;
  NewUser new_User_6;
  NewUser new_User_7;
  Validator validator;



@Before
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
@Before
public void validCheckSetup(){
  ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  validator = factory.getValidator();

}

  //Does my UserId generate?
@Test
  public void generateUserId(){

  assertEquals(1, new_User_2.getId() - new_User_1.getId());
}

  //Can I generate a profile with all information?
  @Test
  public void profileConstructorSetsAllFields(){
    assertTrue(new_User_1.getUsername().equals((String) new_User_1.getUsername()));
    assertEquals("isabella_jones@gmail.com", new_User_1.getEmail());
    assertTrue(new_User_1.getFirstname().equals((String) new_User_1.getFirstname()));
    assertEquals("Izzy", new_User_1.getFirstname());
    assertEquals("My favorite things in the world are coffee and cake", new_User_1.getAboutme());
    assertTrue(new_User_1.getAboutme() instanceof AboutMe);
    assertTrue(new_User_1.getPassword().equals((String) new_User_1.getPassword()));
  }
  //Can I generate a profile without AboutMe and password?

  @Test
  public void profileConstructorsetsRequiredFields(){
    assertTrue(new_User_2.getUsername().equals((String) new_User_2.getUsername()));
    assertEquals("CoffeeFiend", new_User_2.getUsername());
    assertTrue(new_User_2.getFirstname().equals((String) new_User_2.getFirstname()));
    assertEquals("Stan", new_User_2.getFirstname());
    assertTrue(new_User_2.getAboutme() instanceof AboutMe);
    assertEquals("Stanley_Smith@yahoo.com", new_User_2.getEmail());

  }
  @Test
  public void constructorSetsWithoutFirstname(){
  assertTrue(new_User_7.getUsername().equals((String) new_User_7.getUsername()));
  assertEquals("I_like_Coffee", new_User_7.getUsername());
  assertEquals("Fred@gmail.com", new_User_7.getEmail());
  assertTrue(new_User_7.getFirstname.equals(null));
  assertTrue(new_User_7.getFirstname.equals(new_User_7.getFirstname()));
  assertEquals(null, new_User_7.getFirstname());
  assertEquals("My name is Fred. I chose to write it here instead.", new_User_7.getAboutme());
    assertTrue(new_User_7.getAboutme() instanceof AboutMe);
  assertTrue(new_User_7.getPassword().equals(String) new_User_7.getPassword()));






  }
  @Test
  public void constructorSetsWithoutAboutMe(){
    assertTrue(new_User_3.getUsername().equals(String) new_User_3.getUsername()));
    assertEquals("I_am_A_Latte", new_User_3.getUsername());
    assertEquals("ashleyAshley@outlook.com", new_User_3.getEmail());
    assertEquals("Ashley", new_User_3.getFirstname());
    assertTrue(new_User_3.getFirstname().equals(String) new_User_3.getFirstname()));
    assertTrue(new_User_3.getAboutme().equals(null));
    assertTrue(new_User_3.getAboutme() instanceof AboutMe);
    assertEquals(null, new_User_1.getAboutme());
    assertTrue(new_User_3.getPassword().equals(String) new_User_3.getPassword()));

  }

  //Because the current way I have it set up is not secure, also not what I'd like to do, and too involved to complete right now.
  @Test
  public void constructorSetsWithoutPassword(){
    //new_User_6 = new UserProfileCreate("CoffeeFriend", "Friend@gmail.com", "Andy", "I like coffee.", null);
    assertTrue(new_User_6.getUsername().equals(String) new_User_6.getUsername()));
    assertEquals("CoffeeFriend", new_User_6.getUsername());
    assertTrue(new_User_6.getEmail() instanceof UserEmail);
    assertEquals("Friend@gmail.com", new_User_6.getEmail());
    assertEquals("Friend@gmail.com", new_User_6.UserEmail.getValue());
    assertEquals("Andy", new_User_6.getFirstname());
    assertTrue(new_User_6.getFirstname().equals(String) new_User_6.getFirstname()));
    assertEquals("I like coffee.", new_User_6.getAboutme());
    assertTrue(new_User_6.getAboutme() instanceof AboutMe);
    assertTrue(new_User_6.getPassword().equals(null));
    assertTrue(new_User_6.getPassword.equals(new_User_7.getPassword()));
    assertEquals(null, new_User_7.getPassword());




  }

  //Is there an error when I don't include a Username?
  @Test
  public void errorMessageWhenNoUserName(){
    NewUser new_User_8;
    username.setUsername(null);
    Set<ConstraintViolation<new_User_8>> violations = validator.validate(username);
    assertFalse(violations.isEmpty());


  }
  //Is there an error when I don't include an Email?
  @Test
  public void errorMessageWhenNoEmail(){
  NewUser new_User_9;
  email.setEmail(null);
    Set<ConstraintViolation<new_User_9>> violations = validator.validate(email);
    assertFalse(violations.isEmpty());

  }

}

