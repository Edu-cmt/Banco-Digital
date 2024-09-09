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

| Conta Poupança Criada | Conta Corrente Criada |
|----------|----------|
| ![image](https://github.com/user-attachments/assets/8dbd9eb4-e38b-4aa2-8503-1562e65f502f) | ![image](https://github.com/user-attachments/assets/55485b94-174f-456d-a6d8-96804be8081c)

##### Depósito relizado na conta poupança através do numero da conta(gerado automaticamente ao criar a conta).
![image](https://github.com/user-attachments/assets/081e7189-7b07-4d74-9f8d-2ba007192977)





