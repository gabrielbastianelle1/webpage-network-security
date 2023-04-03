FROM ubuntu

RUN apt update
RUN apt install -y apache2

RUN apt install -y iputils-ping
RUN apt install -y  net-tools 

COPY configure-apache.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/configure-apache.sh && /usr/local/bin/configure-apache.sh

CMD ["apache2ctl", "-D", "FOREGROUND"]