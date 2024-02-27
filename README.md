# https://e-van.cloud

spesifikasi

mvn -version
Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)

java -version
openjdk version "11.0.2" 2019-01-15

postgresql
13

# buat rool nya username : wulys / pass : 1234wuls

CREATE ROLE wulys WITH
LOGIN
SUPERUSER
INHERIT
CREATEDB
CREATEROLE
NOREPLICATION
ENCRYPTED PASSWORD '6cf8cbf54960e2ebe8b0b76554a0d95c';

# buat database namanya wulsys

CREATE DATABASE wulsys
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
java -jar evan.cloud/target/evan-0.0.1-SNAPSHOT.jar

aplikasi run di port 8080
http://localhost:8080/
