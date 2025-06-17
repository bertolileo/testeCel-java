# Modelagem UML e Java

Este projeto apresenta uma solução em Java para o desafio de modelagem de classes inspirado no vídeo de lançamento do iPhone de 2007. A proposta de Steve Jobs foi criar um único dispositivo que combinasse três funcionalidades: um reprodutor musical, um aparelho telefônico e um navegador de internet.

A arquitetura reflete essa ideia utilizando Interfaces para definir os contratos de cada funcionalidade e uma classe `IPhone` que implementa todas elas.

## Diagrama de Classes (UML)

O diagrama abaixo ilustra a relação entre as interfaces e a classe concreta `IPhone`. A classe implementa os comportamentos definidos por cada interface, centralizando as funcionalidades em um único objeto.

```mermaid
classDiagram
    direction BT

    class IPhone {
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

    interface ReprodutorMusical {
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
```

## Estrutura dos Arquivos

O projeto está organizado nos seguintes arquivos Java:

-   `ReprodutorMusical.java`: Interface com os métodos de um player de música.
-   `AparelhoTelefonico.java`: Interface com os métodos de um telefone.
-   `NavegadorInternet.java`: Interface com os métodos de um navegador web.
-   `IPhone.java`: Classe concreta que implementa as três interfaces e contém um método `main` para demonstração.
