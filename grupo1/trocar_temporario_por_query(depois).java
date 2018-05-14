private double getBasePrice(double _quantity, double _itemPrice){
  return _quantity * _itemPrice;
}

if (getBasePrice(_quantity, _itemPrice) > 1000)
  return getBasePrice(_quantity, _itemPrice) * 0.95;
else
  return getBasePrice(_quantity, _itemPrice) * 0.98;

//######################################################
// Exemplo 2

double getBasePrice(){
  return _quantity * _itemPrice;
}

double discountFactor() {
  if (getBasePrice() > 1000)
    return 0.95;
  else
    retturn 0.98;
}

double getPrice() {
  return getBasePrice() * discountFactor();
}
