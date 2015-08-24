package com.clouway.objects.association;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Boss {

  public void dirtyFloorComplaint(int floor){
    Employee john = new Employee();
    john.doCleaning(floor);
  }
}
