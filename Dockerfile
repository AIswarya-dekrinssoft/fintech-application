FROM amazonlinux:latest
RUN yum install httpd -y
COPY index.html /var/www/html/
EXPOSE 80

WORKDIR /opt
CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
