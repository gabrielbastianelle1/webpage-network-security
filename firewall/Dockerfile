FROM ubuntu:latest

# Install dependencies
RUN apt update
RUN apt install -y  shorewall shorewall-core shorewall-init shorewall-doc
#RUN apt install -y firewalld
RUN apt install -y iputils-ping
RUN apt install -y  net-tools
RUN apt install -y  nano
RUN apt install -y nmap
RUN apt install -y dnsutils iproute2 systemd

#nano /etc/sysctl.conf

#cp -rpfv /usr/share/shorewall/configfiles/{interfaces,zones,policy,rules} /etc/shorewall

#touch /var/log/messages
#chmod 644 /var/log/messages