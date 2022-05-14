# ptkp
spesifikasi 

mvn -version
Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)

java -version
openjdk version "11.0.2" 2019-01-15

postgresql
13

buat rool nya username : wull / pass : wull
============================
CREATE ROLE wull WITH
  LOGIN
  SUPERUSER
  INHERIT
  CREATEDB
  CREATEROLE
  NOREPLICATION
  ENCRYPTED PASSWORD 'md51d38d9f1704bc8c4b6c7c9554d55654b';

buat database namanya ptkp
=============================
CREATE DATABASE ptkp
    WITH 
    OWNER = wull
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;



build nya 
mvn package -Dmaven.test.skip

run nya : 
java -jar ptkp/target/ptkp-0.0.1.jar

aplikasi run di port 1919
http://localhost:1919/
