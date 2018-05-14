class Gamma{
  // 1. parametros e temporarios viram campos
  private final Account account;

  private int inputVal;
  private int quantity;
  private int yearToDate;
  private int importantValue1;
  private int importantValue2;
  private int importantValue3;

  // 2. Cria o construtor
  Gamma(Account source, int inputValArg, int quantityarg, int yearToDateArg){
    account = source;
    inputVal = inputValArg;
    quantity = quantityarg;
    yearToDate = yearToDateArg;
  }

  // 3. Computar e dividir
  int compute(){
    importantValue1 = (inputVal * quantity) + account.delta();
    importantValue2 = (inputVal * yearToDate) + 100;

    if ((yearToDate - importantValue1) > 100)
      importantValue2 -= 20;
    importantValue3 = importantValue2 * 7;
    // and so on.
    return importantValue3 - 2 * importantValue1;
  }
}
