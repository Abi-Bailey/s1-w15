import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<Name> friends = new ArrayList<Name>();
    Random r = new Random();
    Name n1 = new Name("Abi", "Mayleng", "Bailey");
    Name n2 = new Name("Noga", "James", "Wallach");
    Name n3 = new Name("Parker", "Ren", "Nagafuji");
   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
    friends.add(n1);
    friends.add(n2);
    friends.add(n3);
    // add three names to the ArrayList
   }
   
   public Name getRandomFriend(){
   //  int x = r.nextInt(friends.size());
      int y = (int)(Math.random() * friends.size());
      return friends.get(y);
    //print out the full name of a random name in the ArrayList
    }

}