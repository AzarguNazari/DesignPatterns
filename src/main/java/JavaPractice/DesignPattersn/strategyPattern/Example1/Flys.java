/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice.DesignPattersn.strategyPattern.Example1;

/**
 *
 * @author Hazar Gul
 */
// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.
// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication
// I'm decoupling : encapsulating the concept that varies
public interface Flys {

    String fly();

}

// Class used if the Animal can fly
class ItFlys implements Flys {

    public String fly() {

        return "Flying High";

    }

}

//Class used if the Animal can't fly
class CantFly implements Flys {

    public String fly() {

        return "I can't fly";

    }

}
