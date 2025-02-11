# TOPOLIGIA-GEOMETRICA
Análises topológicas de geomterias
# Análise de Topologia Geométrica com JTS
Este projeto é uma aplicação em Java que utiliza a biblioteca JTS Topology Suite para realizar operações geométricas e análises topológicas de dados vetoriais, 
como pontos, linhas e polígonos

## Funcionalidades
O código demonstra como:
- Criar geometrias básicas: ponto, linha e polígono.
- Verificar relações topológicas, como
  - Se um ponto está dentro de um polígono.
  - Se uma linha intersecta um polígono.
- Executar operações geométricas
  - Calcular buffers (área ao redor de uma geometria).
  - Realizar união e diferença entre geometrias.
  - Medir distâncias entre geometrias.
- Exibir informações e resultados no console.

## Requisitos
- Java 8 ou superior
- Biblioteca JTS Topology Suite

## Dependências
Certifique-se de adicionar a dependência do JTS no seu arquivo pom.xml se estiver utilizando Maven:
<dependency>
    <groupId>org.locationtech.jts</groupId>
    <artifactId>jts-core</artifactId>
    <version>1.19.0</version>
</dependency>
Se você estiver utilizando outro sistema de build, faça o download da biblioteca JTS no repositório oficial: JTS Downloads.

## Uso
1.Clone o repositório ou copie o código diretamente para seu ambiente de desenvolvimento.
2. Certifique-se de que o ambiente de desenvolvimento esteja configurado para usar Java 8 ou superior.
Adicione a dependência JTS ao projeto.
3. Compile e execute a classe TopologyAnalysis.

## Como Executar
Após configurar o projeto, execute o código a partir do seu IDE (como IntelliJ IDEA ou Eclipse) ou através do terminal, com o seguinte comando:
javac -cp "path/to/jts-core.jar" TopologyAnalysis.java
java -cp ".;path/to/jts-core.jar" TopologyAnalysis

## Exemplos de Saída
- Geometrias criadas (ponto, linha, polígono).
- Verificação de relações topológicas (por exemplo: o ponto está dentro do polígono?).
- Operações geométricas, como buffer e união.
- Medição de distâncias entre geometrias.

##Exemplo de saída no console:
Geometrias Criadas:
Ponto: POINT (5 5)
Linha: LINESTRING (0 0, 10 10, 20 5)
Polígono: POLYGON ((0 0, 10 0, 10 10, 0 10, 0 0))

O ponto está dentro do polígono? true
A linha intersecta o polígono? true

Buffer ao redor do ponto (raio 2.0): POLYGON (...)
Distância do ponto à linha: 0.0

União da linha com o polígono: GEOMETRYCOLLECTION (...)
Diferença entre o polígono e o buffer do ponto: POLYGON (...)

A linha está contida no polígono? false
O polígono toca a linha? true


## Personalização
Você pode personalizar o código par
  - Trabalhar com dados espaciais mais complexos, como arquivos Shapefile ou GeoJSON.
  - Integrar outras bibliotecas geoespaciais, como GeoTools.
  - Adicionar suporte para manipulação de projeções e sistemas de coordenadas.
  - 



  

