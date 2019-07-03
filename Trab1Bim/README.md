# Lista de exercícios

## Problema 1
> Objeto é uma estrutura de dados, que está no mundo real, como por exemplo um carro.

## Problema 2
> Características: Espelho, Câmbio, Lanterna.

> Comportamentos: Acender luz, Abrir porta, Virar as rodas.

## Problema 3
> Atributos e métodos.

## Problema 4
> Diminuir a complexidade de programação, aumentando sua produtividade.

## Problema 5
> Em POO abstração é o foco em utilizar somente aquilo que é realmente importante.

## Problema 6
> Classe é algo que define o comportamento de seus objetos utilizando de metódos e definindo o estado através de atributos.

## Problema 7
> Utilizar qualquer palavra para definir uma variável, desde que comece com letra maiúscula.

## Problema 8
> Nº 4: CarroEletrico.

## Problema 9
> se chama camelCase ex: livroDaEstante.

## Problema 10
> Nº 3: corDeFundo

## Problema 11
> se chama camelCase ex: louçaNaPia.

## Problema 12
> Nº 1: estaVazio.

## Problema 13
> Objeto é um espaço nela para o objeto.

> Ele existe quando é instanciado na memória.

> Deixa de existir quando o programa é encerrado.

## Problema 14
> É utilizado para criar uma instancia de um tipo de objeto definido pelo usuário, possui a função construtora.

## Problema 15
> Construtor é algo utilizado para a inicialização de variáveis com um valor default.

> Construtores servem para construir um objeto da classe.

> Seu nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno.

## Problema 16
> Será utilizado o construtor padrão, ex;
```java
public ALuno{
}
```
## Problema 17
```java
public Aluno{
  public static void main (String[] args){
    Nota = new Nota();
    }
}
```
## Problema 18
```bash
Encapsulament é a técnica que faz com que detalhes internos do funcionamento dos métodos de uma classe permaneçam ocultos para os objetos. É a capacidade de não expor o funcionamento do objeto, somente a própria classe precisa saber como é seu funcionamento. Os outros objetos que iram se comunicar com ela não precisam saber como funcionam seus métodos.
```
## Problema 19
```bash
Ele faz com que o método ou atributo seja acessado por qualquer outro objeto ou então de forma direta.
```
## Problema 20
```bash
Faz com que o método ou atributo seja acessado somente pela própria classe.
```
## Problema 21
```bash
O encapsulamento em uma classe irá definir de que forma será possivel acessar um atributo. Se um atributo for privado, somente será possivel acessar utilizando os métodos da própria classe, se for público poderá ser acessada de forma direta.
```
```Java
public class Aluno{
   private String matricula;
}
```
## Problema 22
```bash
O objetivo é quando o encapsulamento torna um atributo da classe privado, para acessar o valor deste atributo utilizamos um método getter.
```
```Java
public String getCpf(){
   return this.cpf;
}
```
## Problema 23
```bash
O objetivo é quando o encapsulamento torna um atributo da classe privado, para definir o valor deste atributo utilizamos um método setter.
```
```Java
public void setCpf(String cpf){
   this.cpf = cpf;
}
```
## Problema 24
```bash
Classe, Atributos, Métodos.
```
## Problema 25
```bash
Definir o modificador, + é public, - é private, # é protect, ~ é default. O nome do atributo ":" e o tipo. Exemplo: - número: int.
```
## Problema 26
```bash
modificador nomeDoMetodo(parametro: TipoParametro): TipoRetorno +getSaldo(): double
```
## Problema 27
```bash
Utilizando o termo << create >> antes do metodo que leva o mesmo nome da classe. Ex: << create >>+Carro(marca:String, modelo: String, ano: int)
```
## Problema 28
```bash
modificadores: + , - , # , ~ , respectivamente querem dizer, (public), (private), (protect), (default).
```
## Problema 29
| Cliente|
|--------------------|
|-nome: String|
|-email: String|
|-telefone: int|
|--------------------|
|+getNome(): String|
|+setNome(nome: String)|
|+getEmail(): String|
|+setEmail(email: String)|
|+getTelefone(): int|
|+setTelefone(telefone: int)|
## Problema 30
```Java
public class Cliente{
    private String nome;
    private String email;
    private int telefone;
 
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
       
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email; 
    }
       
    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone; 
    }
   }
   ```
   ## Problema 31
   ```Java
   public class Produto{

       private String nome;
    
       public String getNome(){
           return this.nome;
       }
    
       public void setNome(String nome){
           this.nome = nome; 
       }
   }
   
   public class Password{

       private String value;
    
       public void Password(String value){
       }
    
       public boolean isEqual(Password p){
       }
   }
   
   public class Animal{
       
       private boolean alive;
       
       public boolean isAlive(){
       }
       
       private void die(){
       }
   }
   ```
   ## Problema 32
   |Livro|
   |----------------------------------|
   |-nome: String|
   |----------------------------------|
   |+getNome(): String|
   |+setNome(nome: String)|
   
|ContaCorrente|
|----------------------------------|
|-Saldo: double|
|----------------------------------|
|+sacar(valor:double)
|+depositar(valor:double)|
|-recalcularSaldo()|

|Par|
|----------------------------------|
|+chave: String|
|+valor: String|

|Impressora|
|----------------------------------|
|+imprimir(documento:Documento)|

## Problema 33
```bash
O estado de um objeto é os valores que seus atributos possuem no momento, os atributos de instância (ou de objeto) definem o estado desse objeto.
```

## Problema 34
```Java
public class Dog(){
    int = 0
    String = null
    boolean = false
```

## Problema 35
```Java
public class Dog(){
    Years int = 10
    name String = "Spike"
    alive boolean = true
```
## Problema 36
```Java
public class pug(){
    idade int = 2
    nome String ="Spoke"
    vivo boolean = true
    
public class buldog(){
    idade int = 0
    nome String ="Spike"
    vivo boolean = false
```
## Problema 37
```bash
Os erros que identifiquei no código são: atributo weight está como public, o que acaba inutilisando os métodos getWeight e setWeight, o que permite o acesso direto ao atributo.
No método main, após instânciar o objeto, o atributo name é acessado de forma direta, o que não é possivel, pois seu modificador é privado.
As possíveis correções que identifiquei: Poderiamos colocar todos os atributos como privados e utilizar os setters para modificar o estado dos atributos do objeto.
```
