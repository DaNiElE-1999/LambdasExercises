FROM openjdk:11

COPY ./src/main/java/LamdaPackage/ /tmp

WORKDIR /tmp

RUN javac Exercise22.java

CMD ["java","Exercise22"]
