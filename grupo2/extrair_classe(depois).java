class Person{

  private String _name;
  private TelephoneNumber telephoneNumber = new TelephoneNumber();

  public String getName() {
  return _name;
  }

  public String getTelephoneNumber() {
    return telephoneNumber.getTelephoneNumber();
  }

  public String getOfficeNumber() {
    return telephoneNumber.getOfficeNumber;
  }

}

class  TelephoneNumber {
  private String areaCode;
  private String number;

  void setOfficeAreaCode(String arg) {
  areaCode = arg;
  }

  String getOfficeAreaCode() {
  return areaCode;
  }

  public String getTelephoneNumber() {
  return ("(" + areaCode + ") " + number);
  }

  void setOfficeNumber(String arg) {
  number = arg;
  }

  String getOfficeNumber() {
  return number;
  }
}
