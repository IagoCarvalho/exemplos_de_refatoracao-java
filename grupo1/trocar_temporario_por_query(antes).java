// Quando se utiliza uma variável temporária para
// armazenar o resultado de uma
// expressão.

// Bom utilizar antes de extrair metodo

double basePrice = _quantity * _itemPrice;
  if (basePrice > 1000)
    return basePrice * 0.95;
  else
    return basePrice * 0.98;


//###############################################
// Exemplo 2

double getPrice() {
 int basePrice = _quantity * _itemPrice;
 double discountFactor;
 if (basePrice > 1000) discountFactor = 0.95;
 else discountFactor = 0.98;
 return basePrice * discountFactor; 
