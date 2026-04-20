FROM httpd:2.4

# Copy custom proxy config
COPY httpd-proxy.conf /usr/local/apache2/conf/extra/httpd-proxy.conf

# Copy maintenance page
COPY maintenance.html /usr/local/apache2/htdocs/

# Include our config into default Apache config
RUN echo "Include conf/extra/httpd-proxy.conf" >> /usr/local/apache2/conf/httpd.conf

EXPOSE 80
