# README - ETAPA 4: Documentação e Javadoc

## Descrição do Projeto
Este repositório contém a implementação e documentação da classe `User` dentro do pacote `org.example`, que é responsável por gerenciar as operações de autenticação de usuários em um sistema que interage com um banco de dados.

## Documentação do Código
A documentação do código foi realizada diretamente nos arquivos fonte em Java, utilizando Javadoc. Isso inclui descrições detalhadas das funcionalidades da classe, seus métodos e variáveis. A documentação ajuda a entender o propósito e o funcionamento do código, facilitando a manutenção e a expansão futuras.

### Classe User
A classe `User` gerencia a autenticação de usuários. Ela possui métodos para conectar-se ao banco de dados e verificar se um usuário com credenciais específicas existe.

#### Métodos Principais
- **conectarBD()**: Estabelece uma conexão com o banco de dados.
- **verificarUsuario(String login, String senha)**: Verifica se o usuário existe no banco de dados com base no login e senha fornecidos.

## Javadoc
O Javadoc gerado fornece uma interface visual para a documentação do código. Ele está disponível no diretório `doc` do projeto e pode ser acessado abrindo o arquivo `index.html` em um navegador web.

### Como Acessar o Javadoc
Para acessar o Javadoc, navegue até o diretório `doc` e abra o arquivo `index.html` em seu navegador. Isso exibirá a documentação gerada, onde você pode visualizar detalhes de cada classe e método documentado.

## Conclusão
A documentação detalhada e o Javadoc são essenciais para qualquer projeto de software, pois facilitam o entendimento do código por desenvolvedores atuais e futuros. Este repositório demonstra como a documentação adequada e o uso de Javadoc podem melhorar a manutenção e a compreensão de um sistema de autenticação de usuários.

## Comandos para Gerar Javadoc
Caso precise gerar o Javadoc novamente, você pode usar o seguinte comando no diretório raiz do projeto:
