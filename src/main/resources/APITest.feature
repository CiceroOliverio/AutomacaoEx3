#language: pt

  Funcionalidade: Consumir API de Consulta CEP
    Consumir a API e consulta de CEP


  Cenario: Cosultar CEP
    Dado que eu possua um CEP válido para consulta
    Quando eu pesquisar o CEP
    Entao eu devo ver os dados referentes ao CEP