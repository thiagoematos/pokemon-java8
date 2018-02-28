# pokemon-java8
Demonstração de algumas das novas features do Java 8 usando Modelo 1-Treinador para N-Pokemons.
✔

# Introdução
- [ ] Vamos fazer um lambda?
- [ ] Mas antes, conhecer o model: (1)Treinador-(N)Pokemons

# A_Lambda
- [ ] Problema: Escrever um for reusável em qualquer lista
- [ ]           Indicar a lista e ação em cada item
- [ ] Solução:  Builder com classe anônima
- [ ] Mas... É feio...
- [ ] Implementar: forEach com Classe Anônima
- [ ] Transformar para lambda
- [ ] Só dá para transformar se for Interface Funcional

# B_FunctionalInterface_DefaultMethod
- [ ] Transformar os validadores para lambda
- [ ] Jogar o método para dentro da interface
- [ ] Explicar palavra-chave: `default`
- [ ] Sobreescrever default method na Main
- [ ] Reforçar: Lambda só em interface funcional

# C_List_DefaultMethods_MethodReference
- [ ] JDK8 trouxe vários default
- [ ] Mostrar sort do iterator
- [ ] Transformar para lambda
- [ ] Comparator tem default:
```
Comparator.comparing
Comparator.thenComparing
```

# D_Stream_filter_map_Collectors_toList
- [ ] Principal default: Collection.stream()
- [ ] Como funciona?
- [ ]     Slide: Collection vs Stream
- [ ]            Lista de Operações
- [ ]            Coletar resultado
- [ ]            Tipo de coletores
- [ ]     Código
- [ ]            Só o que interessa
-  | condição | ação |  resultado |
   | ---------|------|----------- |
   | filter() | map()| toList()   |

# E_Stream_sum
- [ ] Cortar

# F_Stream_flatMap_distinct
- [ ] Slide:  Mostrar objetivo desse desafio
- [ ] Código
- [ ]     Só o que interessa:
- [ ]         Linha 23 - pokemons de cada treinador
- [ ]         Linha 20 - Set para não repetir
- [ ]     Mostrar flatMap espera um stream
- [ ]     Coletar num toSet()

# G_Collectors_groupingBy
- [ ]  Conhecer outros Coletores
- [ ]  Slide
- Diferença entre groupingBy e toMap
- [ ]  Código
- Linha 22 e 23

# H_Collectors_toMap_Optional
- [ ] Código Linha 24 chave-valor
- [ ] toMap
- sem Optional ainda
- [ ] Dá pra melhorar?
- [ ] Optional errado
- isPresent
- [ ] Certo
- map
- orElse

# Recapitulação
- [ ] Roteiro.txt
- [ ] API de Stream é só uma das novidades
- CompletableFuture
- DataTime
- Rhino
- [ ] Slide
- Por que usar
- Meme
- [ ] Perguntas???
