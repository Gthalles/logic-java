# logic
Exercicios simples para praticar sintaxe em Java (arrays e strings).

## Requisitos

- Java 17+
- Maven 3.9+

## Rodando

Build:

```bash
mvn clean package
```

Executar:

```bash
mvn exec:java
```

## Estrutura

- `src/main/java`: codigo-fonte
- `pom.xml`: configuracao do Maven

## Exercicios

### Arrays

1. Soma de elementos do array.
2. Encontrar o maior numero (sem `Math.max`).
3. Contar quantos numeros pares existem.
4. Inverter um array sem usar `.reverse()`.
5. Remover duplicados de um array.
6. Encontrar o segundo maior numero.
7. Somar apenas numeros positivos de um array.
8. Rotacionar um array `k` posicoes (ex: `[1,2,3,4,5]`, `k=2` -> `[4,5,1,2,3]`).

### Strings

1. Reverter string.
2. Verificar se uma palavra e palindromo.
3. Contar vogais em uma string.
4. Contar frequencia de cada caractere.
5. Remover caracteres duplicados.
6. Verificar se duas strings sao anagramas.
7. Substituir espacos por `%20` (estilo URL encoding).
8. Encontrar a maior substring sem caracteres repetidos.
