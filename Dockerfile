FROM java:8
#RUN mkdir /home/core \
#    cd /home/core \
RUN git clone https://github.com/pcjoshi9/base-core.git
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac myapp.java
CMD ["java", "myapp"]
