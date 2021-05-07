# Coffee-Social-App-
Tentative Plan for User Profile Feature **Updated 5/7/2021**: 

The Java backend component uses a GUI model/controller structure to generate objects and save in a SQL database. Our User Repository with SQL database implements Spring Security features and BCrypt for security. I still intend to implement Oauth2, though, eventually. After that, the next biggest fixes for the user object are to add more exception handlers for the login/register process, add a photo upload feature to both objects in my backend, and start building some basic customizable methods to assign user/client/admin authorization.
 

Profiles store the following information from users: Email (normally necessary for communication between
the site and users and to confirm user identities), Username, First name (or 
first initial--since I don't have a length requirement in my validation for first name), a short about me limited to 500 characters. I would like to add additional sub-prompts to the about (within the edit profile) to create a hyper-linked display list of further user preferences like types of food to buy at cafes and favorite kinds of coffee or caffee drinks/beans and roasts, etc. I think it would be helpful in linking the reviews and cafes to a recommendation API feature that would a. display cafe review recommendations relevant to the users' further preferences from already existing reviews of other users, and b. eventually let users include further useful information about what else is on the menu at those cafes. 


I have prepared controllers for: 
A landing "Create New User Profile" page (a sign-up page)
An Edit Profile View for returning users (for the additional sub-prompts for "about me", and also to include a "delete profile" option, 
and option to upload a profile photo--if time allows us to implement the photo upload feature)
A "View Profile" View (which calls the information from Username, First name, About me, and the sub-prompts, and potentially the profile photo).





