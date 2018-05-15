// Usando subclasse
class mfDate extends Date{

  public mfDate(String stringDate){
    super(stringDate);
  }

  public mfDate(Date arg){
    super(arg.getTime());
  }

  public Date nextDay(){
    return new Date (getYear(),getMonth(), getDate() + 1); 
  }

  public dayOftheYear();
}

// Usando classe invólucro
