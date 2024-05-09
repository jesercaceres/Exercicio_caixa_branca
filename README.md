# README - Teste de Caixa Branca

## Descrição do Projeto
Este projeto envolve a análise e proposta de correções para um código Java que realiza conexões com um banco de dados e verifica credenciais de usuário, seguindo os princípios do teste de caixa branca.

## Pontos de Observação no Teste de Caixa Branca

### A documentação foi descrita no código?
- **Situação Atual**: Não há documentação interna ou comentários explicativos no código.
- **Proposta de Correção**: Adicionar documentação detalhada e comentários em JavaDoc para facilitar a compreensão e manutenção do código.

### As variáveis e constantes possuem boa nomenclatura?
- **Situação Atual**: As variáveis e constantes usam nomes genéricos e pouco descritivos.
- **Proposta de Correção**: Renomear variáveis e constantes para melhor refletir suas funções e melhorar a clareza do código.

### Existem legibilidade e organização no código?
- **Situação Atual**: O código carece de organização e legibilidade adequadas.
- **Proposta de Correção**: Reorganizar o código, melhorar a formatação e dividir responsabilidades em métodos mais específicos.

### Todos os null pointers foram tratados?
- **Situação Atual**: O código não possui tratamento adequado para null pointers.
- **Proposta de Correção**: Implementar verificações de nullidade e tratamento de exceções para prevenir `NullPointerException`.

### A arquitetura utilizada foi devidamente respeitada?
- **Situação Atual**: O código não segue uma arquitetura clara ou consistente.
- **Proposta de Correção**: Definir e seguir uma arquitetura modular para facilitar futuras manutenções e expansões.

### As conexões utilizadas foram fechadas?
- **Situação Atual**: As conexões com o banco de dados não são fechadas adequadamente, levando a possíveis vazamentos de recursos.
- **Proposta de Correção**: Assegurar que todas as conexões, `Statement` e `ResultSet` sejam fechadas corretamente em blocos `finally`.

## Ferramentas Utilizadas
- **FindBugs**: Recomendamos utilizar para identificar e corrigir bugs e problemas de segurança no código.
- **Git**: Usado para controle de versão e colaboração.

## Observações sobre os testes de caixa branca:
- **Teste de caixa branca**: Para visualizar as observações acesse a [Planilha](https://docs.google.com/spreadsheets/d/1WgZ5lpHDEd8cVqfdenVvF3V6-dxjeqnROvDYtFF5kqU/edit?usp=sharing) e vá até a aba `CAIXA BRANCA (ESTÁTICO)`

## Conclusão
As propostas de correção baseadas nos princípios de teste de caixa branca visam melhorar a qualidade e segurança do código. Este exercício também enfatiza a importância das boas práticas de programação e do teste contínuo.
