FROM java

RUN mkdir -p /home/pavan/

COPY ./target/firstapi.jar /home/pavan

CMD ["java","-jar","/home/pavan/firstapi.jar"]