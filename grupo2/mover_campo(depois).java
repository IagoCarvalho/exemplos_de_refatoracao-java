class Account{

  private AccountType _type;

  double interestForAmount_days (double amount, int days) {
    return _type.getInterestRate() * amount * days / 365;
  }

}

class AccountType{
  private double _interestRate;

  void setInterestRate(double interestRate){
    this._interestRate = interestRate;
  }

  void getInterestRate(){
    return _interestRate;
  }

}
