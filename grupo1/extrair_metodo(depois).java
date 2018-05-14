class MyClass {

  void printDetails(double outstanding){
    System.out.println ("name: " + _name);
    System.out.println ("amount " + outstanding);
  }

  void PrintOwing(){
    printBanner();
    printDetails(getOutstanding());
  }
}

//#########################################################

void printBanner() {
  System.out.println ("**************************");
  System.out.println ("***** Customer Owes ******");
  System.out.println ("**************************");
}

double calculateOutstanding(){
  Enumeration e = _orders.elements();
  double outstanding = 0.0;

  while (e.hasMoreElements()) {
    Order each = (Order) e.nextElement();
    outstanding += each.getAmount();
  }
  return outstanding;
}

void printDetails(double outstanding) {
  System.out.println ("name:" + _name);
  System.out.println ("amount" + outstanding);
}

void PrintOwing() {
  printBanner();
  printDetails(calculateOutstanding());
}
