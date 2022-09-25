1. Para baixar o contrato (swagger) da Api da Marvel, baixe o arquivo jar via comando wget do linux ou mac 

```
wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.29/swagger-codegen-cli-3.0.29.jar -O swagger-codegen-cli.jar
```
Obs: O windows não possui o wget, tem que baixar [aqui](http://downloads.sourceforge.net/gnuwin32/wget-1.11.4-1-bin.zip) e adicionar nas variáveis de ambiente. 

2. Baixar o aquivo json da documentação do swagger da  api marvel [aqui](https://gateway.marvel.com/docs/public) salve com o nome: "marvel-public-api-v1-swagger.json"

3. Executar o comando abaixo para  gerar as interfaces do swagger

```
java -jar swagger-codegen-cli.jar generate -i marvel-public-api-v1-swagger.json -l spring --library spring-cloud -o marvel
```
Obs: No windows caso ocorra o erro "Error: Unable to access jarfile swagger-codegen-cli.jar" Clique com o botão direito sobre o arquivo e marque a opção desbloquear arquivo.


