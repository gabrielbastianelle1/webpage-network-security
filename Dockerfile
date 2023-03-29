FROM maven

WORKDIR /app

COPY pom.xml .
COPY run.sh .

EXPOSE 8080

CMD ["echo", "working"]