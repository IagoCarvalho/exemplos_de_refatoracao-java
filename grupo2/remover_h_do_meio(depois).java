class Person{
  Department _department;

  public Person getDepartment(){
    return _department;
  }

}

class Department{
  private Person _manager;

  public Department (Person manager) {
    _manager = manager;
  }

  public Person getManager(){
    return _manager;
  }
}
