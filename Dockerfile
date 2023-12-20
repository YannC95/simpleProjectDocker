FROM maven:3.8.6-openfdk-11

WORKDIR /srv

COPY . .

RUN mvn clean install

CMD java -jar "./target/simpleProjectDocker-0.0.1-SNAPSHOT.jar"
