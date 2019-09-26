# SOLID Challenge

This challenge was suggested during a DOJO session so I could exercise the SOLID concepts implementing a system that calculats vehicle tax.

* SRP => Single Responsibility Principle
* OCP => Open/Closed Principle
* LSP => Lisbok Substitution Principle
* ISP => Interface Segregation Principle
* DIP => Dependency Inversion Principle

----------
Instruções

- A aplicação a ser desenvolvida deverá minimamente utilizar o Spring/Spring MVC para exposição das rotas e injeção de dependências.
- O contexto base da aplicação é http://localhost:8080/sca
- O arquivo data.sql contém os dados de veículos como o valor de mercado e quantidade de pneus
- O arquivo VeiculoRepository já faz uma busca pelo registro do veículo

---------

Iremos criar uma aplicação para o governo para cálculo do I.V (Imposto Veicular) onde esta aplicação terá inicialmente 2 funcionalidades detalhadas a seguir

####
# Cálculo do I.V

A aplicação deverá expor uma rota iv/valor do tipo GET que será responsável por efetuar o cálculo do I.V conforme o código de registro informado

O cálculo do imposto é feito pelo valor * alíquota (em porcentagem) onde cada tipo de veículo possui um percentual

* carro: 10%
* moto: 3%
* onibus: 8%

Como retorno deste endpoint deverá ser informado o valor do imposto calculado

####
# Cálculo do I.V para caminhões

Foi requisitada uma mudança no serviço de cálculo do I.V onde agora deverá ser contemplado também o tipo de veículo caminhao com alíquota de 7% onde além do cálculo base terá um adicional no cálculo do imposto de 10 reais por quantidade de rodas.

####
# Pagamento

Além da rota anterior a aplicação deverá suportar o pagamento do imposto a vista através do código de registro

Para fins desta aplicação o serviço de pagamento deverá aceitar todos os pagamentos retornando um hash da confirmação do pagamento (sugestão UUID.randomuuid())

Como retorno deste endpoint deverá ser informado o hash da confirmação de pagamento
