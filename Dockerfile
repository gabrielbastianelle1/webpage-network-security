FROM maven


RUN apt update
RUN apt install -y iputils-ping
RUN apt install -y  net-tools 

WORKDIR /app

COPY pom.xml .
COPY run.sh .

EXPOSE 8080

CMD ["echo", "working"]