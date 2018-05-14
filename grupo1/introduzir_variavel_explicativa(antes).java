// Quando possui uma situação complicada
// Algoritmos longos
// interessante para logica condicional

double price() {
  // price is base price - quantity discount + shipping
return _quantity * _itemPrice -
Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
Math.min(_quantity * _itemPrice * 0.1, 100.0);
}
