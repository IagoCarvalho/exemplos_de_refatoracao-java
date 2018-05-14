//  Um cliente realiza uma chamada a uma
// classe delegada de um objeto.

// Crie métodos no servidor para ocultar a
// classe delegada.

class Person {
  Department _department;

  public Department getDepartment() {
    return _department;
  }

  public void setDepartment(Department arg) {
    _department = arg;
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
