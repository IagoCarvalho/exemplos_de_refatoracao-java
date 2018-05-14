//  Um campo é (ou será) mais utilizado por uma
// outra classe do que naquela em que
// ele está definido

// Outro motivo para mover campos é quando
// aplica-se Extrair Classe

class Account{

  private AccountType _type;
  private double _interestRate;

  double interestForAmount_days (double amount, int days) {
    return _interestRate * amount * days / 365;
  }

}
