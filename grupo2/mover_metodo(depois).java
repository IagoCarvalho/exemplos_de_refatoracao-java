class AccountType{

  double overdraftCharge(int daysOverdrawn) {
    if (type.isPremium()) {
      double result = 10;
      if (daysOverdrawn > 7) result += (daysOverdrawn - 7) *
      0.85;

      return result;
    }
    else return daysOverdrawn * 1.75;
    }
}

class Account{

  double overdraftCharge(){
    return _type.overdraftCharge(_daysOverdrawn)
  }

  double bankCharge() {
    double result = 4.5;
    if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
    return result;
  }
}
