#!/bin/bash

# Enable SSL module
a2enmod ssl

# Generate SSL certificates
openssl req -x509 -nodes -days 365 -newkey rsa:2048 -keyout /etc/ssl/private/apache-selfsigned.key -out /etc/ssl/certs/apache-selfsigned.crt -subj "/C=PT/ST=Viana do Castelo/L=Viana do Castelo/O=SynapseTech Ltd/OU=MyDept/CN=synapsetech"


# Create Apache virtual host configuration file
cat > /etc/apache2/sites-available/springmvc.conf <<EOF
<VirtualHost *:443>
    ServerName synapsetech

    SSLEngine on
    SSLCertificateFile /etc/ssl/certs/apache-selfsigned.crt
    SSLCertificateKeyFile /etc/ssl/private/apache-selfsigned.key

    ProxyPreserveHost On
    ProxyPass / http://app:8080/
    ProxyPassReverse / http://app:8080/
</VirtualHost>

<VirtualHost *:80>
    ServerName synapsetech
    Redirect / https://synapsetech/
</VirtualHost>
EOF

# Enable proxy modules
a2enmod proxy
a2enmod proxy_http

# Enable the virtual host
a2ensite springmvc.conf

# Restart Apache
service apache2 restart