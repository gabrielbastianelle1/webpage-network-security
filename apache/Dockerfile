FROM ubuntu

RUN apt update
RUN apt install -y apache2

COPY configure-apache.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/configure-apache.sh && /usr/local/bin/configure-apache.sh

EXPOSE 80 443

CMD ["apache2ctl", "-D", "FOREGROUND"]