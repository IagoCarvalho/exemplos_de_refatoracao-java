//  A classe está fazendo muitas delegações simples.

// faça o cliente chamar o objeto delegado diretamente.

class Person{
  Department _department;

  public Person getManager() {
    return _department.getManager();
  }
}

class Department{
  private Person _manager;

  public Department (Person manager) {
    _manager = manager;
  }
}
