//  Um método está sendo (ou será) utilizado
// por diversos elementos de uma outra classe
// diferente daquela na qual ele é definido.

//  Métodos que são longos demais ou
// necessitam de comentários para explicar,
// são sujeitos a essa refatoração.

// Um bom momento de realizar essa refatoração é
// depois de mover alguns campos.

// O que significa sapoha de _

class Account{
  double overdraftCharge() {
  if (_type.isPremium()) {
    double result = 10;
    if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) *
    0.85;

    return result;
  }
  else return _daysOverdrawn * 1.75;
  }
  double bankCharge() {
  double result = 4.5;
  if (_daysOverdrawn > 0) result += overdraftCharge();
  return result;
  }
  private AccountType _type;
  private int _daysOverdrawn;
}
