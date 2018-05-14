class Person {
  Department _department;

  public Person getManager(){
    return _department.getManager();
  }
}

class Department {
  private String _chargeCode;
  private Person _manager;

  public Department (Person manager) {
    _manager = manager;
  }

  public Person getManager() {
    return _manager;
  }
}
