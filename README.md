# Resposta ao desafio de criação de Rest API de Países com recurso a SpringBoot  + Mysql
 Rest API de Cadastro, Visualização, Actualização e Eliminação de Países
 
 O presente desafio foi aceite e desenvolvido por <b>Zenildo Nhabomba</b>. Todos direiros lhe são reservados.
 
 ## Hospedagem
 O desafio foi hospedado na conta AWS (Amazon Web Service) do autor, com recurso <b>Elastic Beanstalk</b> em ambiente <b>Linux</b>.
 
  ## Como testar?
  
   ### 1. Cadastro de um País
  <b>Verbo:</b> POST    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/country/ <br/>
  
  <b>Corpo:</b>
  
  ```json
{
    "name": "Inglatera",
    "capital": "Londres",
    "region": "Europa",
    "area": "Europa",
    "subRegion": "Europa Central"
}
  ```
  
  
  ### 2. Listagem de todos Países
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries   
  
   ### 3. Modificação de propriedades de um País
  <b>Verbo:</b> PUT    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/country/{id}
  
  <b>Corpo:</b>
  
  ```json
{
    "name": "Inglatera  Actualizado",
    "capital": "Londres  Actualizado",
    "region": "Europa  Actualizado",
    "area": "Europa  Actualizado",
    "subRegion": "Europa Central  Actualizado"
}
  ```
  
  ### 4. Eliminação de um País 
  <b>Verbo:</b> DELETE    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/country/{id}
  
  ### 5. Listagem de Países em ordem 
  
  A listagem dos países em ordem pode ser feita indicando dois parâmatros, um que indica qual é a propriedade a ser usada para a ordenação e o segundo que inda se a ordenação é crescente ou decrescente. 
  
   - ### 5.1 Listagem de Países em ordem com base no nome
   
   #### 5.1.1 Listagem de Países em ordem com base no nome de forma crescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=name&orderBy=asc
  
   #### 5.1.2 Listagem de Países em ordem com base no nome de forma descrescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=name&orderBy=desc
  
   - ### 5.2 Listagem de Países em ordem com base na capital
   
   #### 5.2.1 Listagem de Países em ordem com base na capital de forma crescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=capital&orderBy=asc
  
   #### 5.2.2 Listagem de Países em ordem com base na capital de forma descrescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=capital&orderBy=desc
  
   - ### 5.3 Listagem de Países em ordem com base na região
   
   #### 5.3.1 Listagem de Países em ordem com base na região de forma crescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=region&orderBy=asc
  
   #### 5.3.2 Listagem de Países em ordem com base na região de forma descrescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=region&orderBy=desc
  
   - ### 5.4 Listagem de Países em ordem com base na área
   
   #### 5.4.1 Listagem de Países em ordem com base na área de forma crescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=area&orderBy=asc
  
   #### 5.4.2 Listagem de Países em ordem com base na área de forma descrescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=area&orderBy=desc
  
   - ### 5.5 Listagem de Países em ordem com base na sub-região
   
   #### 5.5.1 Listagem de Países em ordem com base na  sub-região de forma crescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=subregion&orderBy=asc
  
   #### 5.5.2 Listagem de Países em ordem com base na  sub-região de forma descrescente
   
  <b>Verbo:</b> GET    <b>URL:</b> http://restapicountriesspring-env.eba-meywrjtj.us-east-2.elasticbeanstalk.com/countries?filterBy=subregion&orderBy=desc
  
  
 
 
