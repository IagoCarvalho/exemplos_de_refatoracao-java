// Uma classe servidora que você utiliza precisa de
// vários métodos adicionais, mas você não pode modificar a classe.

// Crie uma nova classe que contenha esses métodos extras.
// Trasnforme-a em uma subclasse ou “pacote” da classe original.

// Para poucos metodos pode utilizar introduzir metodo estrangeiro


// subclasse
  class mfDate extends Date{
    public nextDay();
    public dayOftheYear();
  }

// involucro
  class mfDate{
    private Date _date;
  }
