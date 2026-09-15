FROM eclipse-temurin:26-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["sh", "-c", "java -jar target/numberguessinggame-0.0.1-SNAPSHOT.jar --server.port=${PORT:-8080}"]
