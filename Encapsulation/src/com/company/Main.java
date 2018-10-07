//encapsulation is the mechanism that allows you to restrict
//
//access to certain components in the objects that you are creating.
//
//So, you're able to protect the members of a class from external access
//in order to really guard against unauthorized access.
//
//it can be very useful to hide that inner working from another class
//
//to sort of give you more control and
//
//to be able to enable you to chBy providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
// By providing only a setter or getter method, you can make the class read-only or write-only.
// In other words, you can skip the getter or setter methods.

package com.company;

public class Main {

    public static void main(String[] args) {
	  /*Player play = new Player();
	  play.health = 20;
	  play.name = "Ash";
	  play.loseHealth(10);
	  play.weapon= "Sword";

        System.out.println("Remaining Health of Player = " + play.healthRemaining());*/

	  EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");  // on encapsulating above sequence
        System.out.println("Initial health is " + player.getHealth());
    }
}
