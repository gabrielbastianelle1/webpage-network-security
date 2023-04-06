FROM kalilinux/kali-rolling

RUN apt-get update && apt-get install -y \
    metasploit-framework \
    hping3 \
    nmap \
    wireshark \
    dnsutils \
    iputils-ping \ 
    net-tools \
    tshark \
    nano


# Clean up
RUN apt-get clean && rm -rf /var/lib/apt/lists/*