// Uma classe não está fazendo muita coisa

// Mover todas suas características para uma
// outra classe e excluí-la.

class Person{

  public String getName() {
  return _name;
  }

  public String getTelephoneNumber(){
  return _officeTelephone.getTelephoneNumber();
  }

  TelephoneNumber getOfficeTelephone() {
  return _officeTelephone;
  }

  private String _name;
  private TelephoneNumber _officeTelephone = new TelephoneNumber();
  class TelephoneNumber...

  public String getTelephoneNumber() {
    return ("(" + _areaCode + ") " + _number);
  }

  String getAreaCode() {
    return _areaCode;
  }

  void setAreaCode(String arg) {
    _areaCode = arg;
  }

  String getNumber() {
    return _number;
  }

  void setNumber(String arg) {
    _number = arg;
  }
}
private String _number;
private String _areaCode;
