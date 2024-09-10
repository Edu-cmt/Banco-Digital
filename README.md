# Objetivo do projeto:
O intuito inicial desse projeto era colocar em prática alguns conceitos de programação orientada a objetos, tais como: Abstração, Polimorfismo,
Herança e Encapsulamento. Nele também puder aplicar, através do Java Collections(List Interface), manipulações com listas e arrays.

Aqui temos as classes: `Conta`, como uma super classe para as classes derivadas `ContaPopanca` e `ContaCorrente`.


A classe `Cliente`, utilizada como um dos atributos na classe `Conta`.


A classe `Banco` que tem como atributo uma lista de contas criadas, e que carrega as regras de negocio para o funcionamento de cada método contido dentro da classe `Conta`. Através dela acessamos a lista
de contas criadas e através desta lista acessamos individualmente cada conta e seus atributos.

A classe `UsuariosMain` para executar o programa. 

### Banco Digital
Esse projeto foi criado para simular o acesso de um cliente ao um banco digital. 
Nesse programa o cliente terá acesso à algumas funcionalidades, como: 
- Criar uma conta e escolher o tipo dessa conta(poupança ou corrente).
- Consultar seu extrato bancário.
- Realizar depósitos, saques e tranferências.

Ao criar uma conta, o cliente receberá o número da conta e a agência.(gerado automaticamente pelo sistema)
Através do número da conta ele poderá realizar as outras operações.


| Conta Poupança Criada | Conta Corrente Criada |
|----------|----------|
| ![image](https://github.com/user-attachments/assets/8dbd9eb4-e38b-4aa2-8503-1562e65f502f) | ![image](https://github.com/user-attachments/assets/55485b94-174f-456d-a6d8-96804be8081c)

##### Depósito relizado na conta poupança.
| Deposito Conta Poupança| Extrato Conta Poupança|
|----------|----------|
| ![image](https://github.com/user-attachments/assets/081e7189-7b07-4d74-9f8d-2ba007192977) | ![image](https://github.com/user-attachments/assets/76c89313-1b04-4233-bec0-f746e0d41450)
##### Saque realizado na conta poupança.
| Saque Conta Poupança| Extrato após o saque|
|----------|----------|
| ![image](https://github.com/user-attachments/assets/afbb77ea-a081-4771-bd6f-fc1094def64d) | ![image](https://github.com/user-attachments/assets/c18b5b87-8855-4f6b-8396-00b8df3571f4)
##### Trasnferência da conta poupança para a conta corrente.
Aqui é pedido o numero da conta emissora e da conta destino para realizar a operação.
| Tranferência entre contas|
|----------|
| ![image](https://github.com/user-attachments/assets/9fd6c2b4-eacf-4f93-b03a-1c22030d1848) |
##### Extrato das contas após a transferência.
| Extrato da conta Poupança| Extrato da Conta Corrente|
|----------|----------|
| ![image](https://github.com/user-attachments/assets/afbb77ea-a081-4771-bd6f-fc1094def64d) | ![image](https://github.com/user-attachments/assets/c18b5b87-8855-4f6b-8396-00b8df3571f4)










