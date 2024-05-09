# README - ETAPA 3: Análise de Fluxo e Complexidade Ciclomática

## Descrição do Projeto
Este documento detalha a análise de fluxo e a complexidade ciclomática do método `verificarUsuario` da classe `User`, que é parte de um sistema de autenticação de usuários.

## Grafo de Fluxo
O grafo de fluxo do método `verificarUsuario` é apresentado abaixo. Ele ilustra os diferentes caminhos que a execução do método pode seguir, dependendo das condições encontradas durante a execução.

![Grafo de Fluxo](https://i.imgur.com/frhRWFq.png)

## Complexidade Ciclomática
A complexidade ciclomática é uma métrica de software que fornece uma medida quantitativa da complexidade lógica de um programa. Ela é calculada com base no número de caminhos independentes através do código, que é determinado pelo grafo de fluxo.

### Cálculo
A complexidade ciclomática \( V(G) \) pode ser calculada como:
\[ V(G) = E - N + 2P \]
onde:
- \( E \) é o número de arestas no grafo.
- \( N \) é o número de nodos no grafo.
- \( P \) é o número de componentes conexos (geralmente 1 em programas conectados).

Para o grafo de fluxo fornecido:
- \( E = 9 \) (número de arestas)
- \( N = 8 \) (número de nodos)
- \( P = 1 \) (um componente conexo)

Assim, a complexidade ciclomática é:
\[ V(G) = 9 - 8 + 2 \times 1 = 3 \]

## Caminhos de Teste
Baseado na complexidade ciclomática, identificamos que existem três caminhos independentes no método `verificarUsuario`. Cada caminho representa uma sequência de execução que deve ser coberta por testes unitários para garantir uma cobertura de teste adequada.

### Caminhos Identificados
1. Caminho 1: Entrada -> Conectar BD -> Construir SQL -> Executar SQL -> Verificar Resultado (Usuário não encontrado) -> Saída
2. Caminho 2: Entrada -> Conectar BD -> Construir SQL -> Executar SQL -> Verificar Resultado (Usuário encontrado) -> Atualizar Variáveis -> Saída
3. Caminho 3: Entrada -> Conectar BD -> Construir SQL -> Executar SQL -> Tratamento de Exceções -> Saída

## Conclusão
A análise de fluxo e a determinação da complexidade ciclomática do método `verificarUsuario` ajudam a entender as diferentes condições que o método pode encontrar e a preparar casos de teste que cobrem todos os caminhos possíveis, garantindo assim uma melhor qualidade e robustez do software.
