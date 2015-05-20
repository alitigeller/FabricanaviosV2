#Fábrica de Navios


###Incremento da Fábrica de Navios ([FabricaNaviosV1](http://alitigeller.github.io/FabricaNavios/)), que implementa os padrões Factory Method e Abstract Factory, acrescentando os Padrões Protótipo e Singleton.

###Class Diagram:
![](https://github.com/alitigeller/FabricanaviosV2/blob/master/Class%20Diagram.jpg?raw=true)

Observe que foram adicionado a classe NavioManager, do tipo Enum, que implementa os padrões citados. Essa classe contém um método para a criação de cada navio, sendo que, cada tipo de navio só é instanciado uma vez, as criações posteriores são feitas através do clone de uma instancia.
